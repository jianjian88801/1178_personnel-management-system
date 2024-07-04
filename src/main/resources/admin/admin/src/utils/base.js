const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootq731f/",
            name: "springbootq731f",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootq731f/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中小企业人事管理系统"
        } 
    }
}
export default base
