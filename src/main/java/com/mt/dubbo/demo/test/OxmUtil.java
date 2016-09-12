package com.mt.dubbo.demo.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.StringUtils;

/**
 * OXM Util
 *
 * @Description: OXM Util
 * @ClassName: OxmUtil
 * @author: caike@xiaoniu66.com
 * @version: xnol-message-1.0.0
 * @since: 1.0.0
 */
public class OxmUtil {

    /**
     * toXML
     *
     * @Description: toXML, if method parameter Object is null, just return null instead.
     * @param obj
     * @return String
     * @throws JAXBException
     * @throws IOException
     * @author caike@xiaoniu66.com
     */
    public static String toXML(Object obj) throws JAXBException, IOException {
        if (null == obj) {
            return null;
        }
        JAXBContext context = JAXBContext.newInstance(new Class[] { obj.getClass() });
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        marshaller.marshal(obj, bos);
        return bos.toString("UTF-8");
    }

    /**
     * fromXML
     *
     * @Description: fromXML, if method parameter xml is blank, just return null instead.
     * @param clazz
     * @param xml
     * @return
     * @throws JAXBException
     * @throws IOException
     * @author caike@xiaoniu66.com
     */
    @SuppressWarnings("unchecked")
    public static <T> T fromXML(Class<T> clazz, String xml) throws JAXBException, IOException {
        if (StringUtils.isBlank(xml)) {
            return null;
        }
        JAXBContext context = JAXBContext.newInstance(new Class[] { clazz });
        Unmarshaller unmarshaller = context.createUnmarshaller();
        ByteArrayInputStream bis = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        return (T) unmarshaller.unmarshal(bis);
    }

}
