package com.lengmu.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * userinfo
 * @author 
 */
@Data
public class Userinfo implements Serializable {
    @TableId(type = IdType.AUTO,value = "uid")
    private Integer uid;

    private String uame;

    private String upsw;

    private String urealname;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Userinfo other = (Userinfo) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUame() == null ? other.getUame() == null : this.getUame().equals(other.getUame()))
            && (this.getUpsw() == null ? other.getUpsw() == null : this.getUpsw().equals(other.getUpsw()))
            && (this.getUrealname() == null ? other.getUrealname() == null : this.getUrealname().equals(other.getUrealname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUame() == null) ? 0 : getUame().hashCode());
        result = prime * result + ((getUpsw() == null) ? 0 : getUpsw().hashCode());
        result = prime * result + ((getUrealname() == null) ? 0 : getUrealname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", uame=").append(uame);
        sb.append(", upsw=").append(upsw);
        sb.append(", urealname=").append(urealname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}