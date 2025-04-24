import {createRouter, createWebHistory} from 'vue-router'
import BasicLayout from "@/layout/BasicLayout.vue";
import {Behavior} from "@/enums/Behavior.ts";
import LoginView from "@/views/LoginView.vue";
import RegistryView from "@/views/RegistryView.vue";


const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: Behavior.HOME,
            component: BasicLayout
        },
        {
            path: Behavior.SIGN_IN,
            component: LoginView,
        },
        {
            path: Behavior.SIGN_UP,
            component: RegistryView,
        },
    ],
})

export default router
