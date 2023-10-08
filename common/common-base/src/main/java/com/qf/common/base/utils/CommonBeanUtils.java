package com.qf.common.base.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author 仇国轩
 */
public class CommonBeanUtils extends BeanUtils {
    /**
     * 拷贝指定源列表 到 指定目标bean类型，并返回目标bean列表
     * copyForList(sources,CartsVO::new)
     *
     * @param targetSupplier 目标bean对象提供者
     * @param sourceList     源bean 列表
     * @param <T>            指目标bean类型
     * @param <D>            指代源bean类型
     * @return 返回指定目标bean类型的列表
     */
    public static <T, D> List<T> copyForList(List<D> sourceList, Supplier<T> targetSupplier) {
        if (ObjectUtils.isEmpty(sourceList) || ObjectUtils.isEmpty(targetSupplier)) {
            return null;
        }
        return sourceList.stream().filter(Objects::nonNull).map(d ->
                        CommonBeanUtils.copyForBean(d, targetSupplier))
                .filter(Objects::nonNull).collect(Collectors.toList());
    }

    /**
     * 拷贝指定bean 到目标bean
     * 用法：
     * copyForBean( useDo,UserDto::new);
     */
    public static <T, D> T copyForBean(D d, Supplier<T> targetSupplier) {
        if (ObjectUtils.isEmpty(targetSupplier) || ObjectUtils.isEmpty(d)) {
            return null;
        }
        T t = targetSupplier.get();
        BeanUtils.copyProperties(d, t);
        return t;
    }
}