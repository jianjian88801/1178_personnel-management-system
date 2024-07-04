import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import bumenxinxi from '@/views/modules/bumenxinxi/list'
    import gongzixinxi from '@/views/modules/gongzixinxi/list'
    import yuangong from '@/views/modules/yuangong/list'
    import zhiweixinxi from '@/views/modules/zhiweixinxi/list'
    import peixunxinxi from '@/views/modules/peixunxinxi/list'
    import zhaopinxinxi from '@/views/modules/zhaopinxinxi/list'
    import fulixinxi from '@/views/modules/fulixinxi/list'
    import kaoqinxinxi from '@/views/modules/kaoqinxinxi/list'
    import renwuxinxi from '@/views/modules/renwuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/bumenxinxi',
        name: '部门信息',
        component: bumenxinxi
      }
      ,{
	path: '/gongzixinxi',
        name: '工资信息',
        component: gongzixinxi
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/zhiweixinxi',
        name: '职位信息',
        component: zhiweixinxi
      }
      ,{
	path: '/peixunxinxi',
        name: '培训信息',
        component: peixunxinxi
      }
      ,{
	path: '/zhaopinxinxi',
        name: '招聘信息',
        component: zhaopinxinxi
      }
      ,{
	path: '/fulixinxi',
        name: '福利信息',
        component: fulixinxi
      }
      ,{
	path: '/kaoqinxinxi',
        name: '考勤信息',
        component: kaoqinxinxi
      }
      ,{
	path: '/renwuxinxi',
        name: '任务信息',
        component: renwuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
