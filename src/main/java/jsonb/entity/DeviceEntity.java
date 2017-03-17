package jsonb.entity;

import jsonb.JsonDataUserType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

/**
 * @author xielongwang
 * @create 2017-03-17 下午7:46
 * @email xielong.wang@nvr-china.com
 */
@Entity
@Table(name = "device")
@TypeDef(name = "JsonDataUserType", typeClass = JsonDataUserType.class)
public class DeviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "deviceNum")
    private String deviceNum;

    @Column(name = "jsonb")
    @Type(type = "JsonDataUserType")
    private String jsonb;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum;
    }

    public String getJsonb() {
        return jsonb;
    }

    public void setJsonb(String jsonb) {
        this.jsonb = jsonb;
    }

    @Override
    public String toString() {
        return "DeviceEntity{" +
                "id=" + id +
                ", deviceNum='" + deviceNum + '\'' +
                ", jsonb='" + jsonb + '\'' +
                '}';
    }
}
