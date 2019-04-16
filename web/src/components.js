import Vue from 'vue';
import Header from './framework/common/Header';
import VueRouter from "vue-router";

export function registerComponents() {
  register();
  Vue.use(VueRouter);
}

function register() {
  Vue.component('app-header', Header);
}
