
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import HelloManager from "./components/listers/HelloCards"
import HelloDetail from "./components/listers/HelloDetail"

import PrintingManager from "./components/listers/PrintingCards"
import PrintingDetail from "./components/listers/PrintingDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/hellos',
                name: 'HelloManager',
                component: HelloManager
            },
            {
                path: '/hellos/:id',
                name: 'HelloDetail',
                component: HelloDetail
            },

            {
                path: '/printings',
                name: 'PrintingManager',
                component: PrintingManager
            },
            {
                path: '/printings/:id',
                name: 'PrintingDetail',
                component: PrintingDetail
            },



    ]
})
