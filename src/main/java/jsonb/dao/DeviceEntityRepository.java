package jsonb.dao;

import jsonb.entity.DeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xielongwang
 * @create 2017-03-17 下午7:47
 * @email xielong.wang@nvr-china.com
 */
public interface DeviceEntityRepository extends JpaRepository<DeviceEntity, Long> {

    DeviceEntity findByDeviceNum(String c20ECF);
}
