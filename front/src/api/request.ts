import axios from "axios";


export const baseURL = 'http://localhost:8080';

const myAxios = axios.create({
    baseURL,
    timeout: 10000,
    withCredentials: true

})


// 添加请求拦截器
axios.interceptors.request.use(function (config) {
    // 在发送请求之前做些什么
    console.log("进入请求拦截器");
    return config;
}, function (error) {
    // 对请求错误做些什么
    return Promise.reject(error);
});

// 添加响应拦截器
axios.interceptors.response.use(function (response) {
    console.log("进入响应拦截器");
    // 2xx 范围内的状态码都会触发该函数。
    // 对响应数据做点什么
    return response;
}, function (error) {
    // 超出 2xx 范围的状态码都会触发该函数。
    // 对响应错误做点什么
    return Promise.reject(error);
});

export default myAxios;

