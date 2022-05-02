import Vue from "vue";
import VueRouter from "vue-router";
import Header from "@/layout/AppHeader";
import Board from "@/views/board/BoardList.vue";
import BoardDetail from "@/views/board/BoardDetail";
import Login from "@/views/VueLogin";
import Register from "@/views/VueRegister";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "board",
    components: {
      header: Header,
      default: Board,
    },
  },
  {
    path: "/detail/:id",
    name: "detail",
    components: {
      header: Header,
      default: BoardDetail,
    },
  },
  {
    path: "/login",
    name: "login",
    components: {
      header: Header,
      default: Login,
    },
  },
  {
    path: "/register",
    name: "register",
    components: {
      header: Header,
      default: Register,
    },
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
