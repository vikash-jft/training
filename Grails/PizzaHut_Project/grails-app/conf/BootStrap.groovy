import com.domain.auth.Role
import com.domain.auth.User
import com.domain.auth.UserRole

class BootStrap {

    def init = { servletContext ->
        if (!Role.findByAuthority('ROLE_USER')) {
            def user = new User(username: 'user', password: "user", email: "a@b.com").save(flush: true, failOnError: true)
            def admin = new User(username: 'admin', password: "admin", email: "b@b.com").save(flush: true, failOnError: true)

            def userRole = new Role(authority: "ROLE_USER").save(flush: true, failOnError: true)
            def adminRole = new Role(authority: "ROLE_ADMIN").save(flush: true, failOnError: true)

            new UserRole(user: user, role: userRole).save(flush: true, failOnError: true)
            new UserRole(user: admin, role: adminRole).save(flush: true, failOnError: true)
        }
    }
    def destroy = {

    }
}
