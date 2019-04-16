import Vue from 'vue';
import App from './App.vue';
import BootstrapVue from 'bootstrap-vue';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap-vue/dist/bootstrap-vue.css';
import VueRouter from "vue-router";
import HelloWorld from "./components/HelloWorld";

Vue.config.productionTip = false;

Vue.use(BootstrapVue);
Vue.use(VueRouter);
const routes = [
    {path: '', component: HelloWorld}
];
const router = new VueRouter({
    routes: routes
});
new Vue({
    router,
    render: h => h(App)
}).$mount('#app');
