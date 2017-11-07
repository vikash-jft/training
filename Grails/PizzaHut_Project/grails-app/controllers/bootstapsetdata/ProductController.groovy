package bootstapsetdata

import com.domain.auth.Role
import com.domain.auth.User
import com.domain.auth.UserRole
import grails.plugin.springsecurity.annotation.Secured

class ProductController {

    List<Item> list=new ArrayList<Item>()
    def springSecurityService

    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    def index(Integer max) {
        User user = springSecurityService.currentUser
        if (user.authorities.any { it.authority == "ROLE_ADMIN" }) {
            redirect(controller: 'item', action: 'index')
            return
        }
        else if(user.authorities.any{it.authority == "ROLE_USER"}) {
            println(springSecurityService.currentUser)
            list.clear()
            redirect(action: 'sucess')
        }
    }

    @Secured(['ROLE_USER'])
    def sucess(Integer max) {
        params.max = Math.min(max ?: 8, 80)
        List<Item> pList=Item.list(params)
        if(params.search){
            def c = Item.createCriteria()
            def results = c.list {
                like('itemName', "%${params.search}%")
            }
            render(view: 'home', model: [allItem: results, itemSize:"${list.size()}",search:params.search])
            return
        }
        render(view: 'home', model: [allItem: pList, itemSize:"${list.size()}",itemInstanceCount: Item.count()])
    }

    @Secured(['ROLE_USER', 'ROLE_ANONYMOUS'])
    def register_user() {
    }

    @Secured(['ROLE_USER', 'ROLE_ANONYMOUS'])
    def save_user() {
        User u = new User(params)
        if (!u.validate()) {
            flash.message = "Please input valid input"
            render view: 'register_user'
        }
        u.save(flush: true, failOnError: true)
        new UserRole(user: u, role: Role.findByAuthority("ROLE_USER")).save(flush: true, failOnError: true)
        flash.message = "${u.username} , you are sucessfully submitted!!! <br/> To login click here  "
        redirect(controller: 'login')
    }

    @Secured(['ROLE_USER'])
    def itemDetail() {
        Item item = Item.get(params.id)
        [itemDetail: item, itemSize:"${list.size()}"]
    }

    @Secured(['ROLE_USER'])
    def addtocart() {
       Item item = Item.get(params.id)

        if(!list.contains(item)){
            list.add(item)
        }

        /*for(user user: list1){
            if(!resultList.contains(user)){
                resultList.add(user);
            }
        }*/
        /*Iterator<Map.Entry<Integer, Item>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Item> entry = entries.next();
            if(entry.getValue() != params.id){
                map.put(temp,item)
            }
            println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }*/
        redirect(action: 'sucess')
    }

    @Secured(['ROLE_USER'])
    def allAddedCart() {
        [addedCartlist:list,itemSize:list.size()]
    }

    @Secured(['ROLE_USER'])
    def deleteItemToCart() {
        Iterator<Item> l=list.iterator()
        if (l.hasNext())
        {
            Item i=l.next()
            list.remove(i)
        }
        List<Item> pList=Item.list(params)
        redirect(action: 'allAddedCart')
    }
}