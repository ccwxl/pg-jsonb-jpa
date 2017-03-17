package jsonb;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonb.repository.DeviceEntityRepository;
import jsonb.entity.DeviceEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author xielongwang
 * @create 2017-03-17 下午7:46
 * @email xielong.wang@nvr-china.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class ApplicationTests {

    @Autowired
    private DeviceEntityRepository deviceEntityRepository;

    @Test
    public void test() throws Exception {
        org.springframework.core.io.Resource fileResource = new ClassPathResource("harvesters.json");
        ObjectMapper objectMapper = new ObjectMapper();
        List<Template> beanList = objectMapper.readValue(fileResource.getInputStream(), new TypeReference<List<Template>>() {});
        String result = objectMapper.writeValueAsString(beanList);
        DeviceEntity deviceEntity=new DeviceEntity();
        deviceEntity.setDeviceNum("C20ECF");
        deviceEntity.setJsonb(result);
        deviceEntityRepository.save(deviceEntity);
        DeviceEntity deviceEntity1 =deviceEntityRepository.findByDeviceNum("C20ECF");
        System.out.println(deviceEntity1);
    }

}
