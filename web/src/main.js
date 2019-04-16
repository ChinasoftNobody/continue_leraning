import Vue from 'vue'
import {Router} from "./router";
import {registerComponents} from "./components";
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
registerComponents();
Vue.use(BootstrapVue);
new Vue({
  router: Router
}).$mount("#app");
