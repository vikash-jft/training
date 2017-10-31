package bootstapsetdata

import grails.plugin.springsecurity.annotation.Secured

class ProductController {

    @Secured(['ROLE_USER'])
    def index() {
        render "Hello User"
    }
    @Secured(['ROLE_ADMIN'])
    def index1() {
        render "Hello admin"
    }
}
