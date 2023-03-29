package it.previnet.academy.fullstack.application.adapter.util;

import it.previnet.academy.fullstack.bean.intf.WithToken;

import javax.enterprise.context.ApplicationScoped;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class BeanUtil {

    public Long getTokenFromBean(WithToken withTokenBean){
        if (withTokenBean==null){
            return null;
        }
        return withTokenBean.getToken();
    }

    public List<Field> getFieldAnnotatedWith(Class<?> beanClass, Class<? extends Annotation> annotation) {
        List<Field> result = new ArrayList<Field>();

        Field[] fields = beanClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];

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
