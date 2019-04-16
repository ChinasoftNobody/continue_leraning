import VueRouter from "vue-router";
import Home from "./framework/Home";

export const Router = new VueRouter({
  routes: [
    { path: '', redirect: '/home'},
    { path: '/home', component: Home}
  ]
});
