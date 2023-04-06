package it.previnet.academy.fullstack.application.adapter.util;

import it.previnet.academy.fullstack.bean.intf.WithToken;

import javax.enterprise.context.ApplicationScoped;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class BeanUtil {

    public Integer getTokenFromBean(WithToken withTokenBean){
        if (withTokenBean==null){
            return null;
        }
        return withTokenBean.getToken();
    }

    public List<Field> getFieldAnnotatedWith(Class<?> beanClass, Class<? extends Annotation> annotation) {
        List<Field> result = new ArrayList<>();

        Field[] fields = beanClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(annotation)) {
                result.add(field);
            }
        }

        if (!beanClass.getSuperclass().equals(Object.class)) {
            result.addAll(getFieldAnnotatedWith(beanClass.getSuperclass(), annotation));
        }

        return result;
    }
}
