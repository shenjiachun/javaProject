package com.zero.rpc;

// 服务注册接口
public interface Registry {
    void register(Class serviceInterface, Class clazz);
}
