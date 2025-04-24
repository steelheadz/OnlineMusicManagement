import type Admin from "@/pojo/Admin.ts";
import myAxios from "@/api/request.ts";

const prefix = '/api/admin';

export const login = async (loginAdmin: Admin) => {
    return await myAxios.post(prefix + '/login', loginAdmin);
}


export const registry = async (registryAdmin: Admin) => {
    return await myAxios.post(prefix + '/registry', registryAdmin);
}