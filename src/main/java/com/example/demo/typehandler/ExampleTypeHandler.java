package com.example.demo.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * @author 胡昊宁
 * @date 2021/1/11
 */

@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes(Integer.class)
public class ExampleTypeHandler extends BaseTypeHandler<ExampleTypeHandler.SysUserStatus> {
    
    
    @Override
    public void setNonNullParameter(final PreparedStatement preparedStatement,
                                    final int i,
                                    final SysUserStatus sysUserStatusEnum,
                                    final JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, sysUserStatusEnum.code);
    }
    
    @Override
    public SysUserStatus getNullableResult(final ResultSet resultSet, final String s) throws SQLException {
        //String s  是数据库的字段名
        return SysUserStatus.DELETE.toEnum(resultSet.getInt(s));
    }
    
    @Override
    public SysUserStatus getNullableResult(final ResultSet resultSet, final int i) throws SQLException {
        return SysUserStatus.DELETE.toEnum(resultSet.getString(i));
    }
    
    @Override
    public SysUserStatus getNullableResult(final CallableStatement callableStatement, final int i) throws SQLException {
        return SysUserStatus.DELETE.toEnum( callableStatement.getInt(i));
    }
    
    public enum SysUserStatus implements EnumCodeMessageTransform<SysUserStatus> {
        
        
        DELETE(0, "禁用"),
        ENABLE(1, "启用");
        private Integer code;
        private String message;
        SysUserStatus(final int c, final String m) {
            this.code = c;
            this.message = m;
        }
       
        public Integer getCode() {
            return code;
        }
        
        public String getMessage() {
            return message;
        }
        
        @Override
        public SysUserStatus toEnum(Integer c) {
            return Arrays.stream(SysUserStatus.values())
                    .filter(sysUserStatus -> sysUserStatus.getCode().equals(c))
                    .findFirst()
                    .orElseThrow();
        }
        
        @Override
        public SysUserStatus toEnum(String m) {
            return Arrays.stream(SysUserStatus.values())
                    .filter(sysUserStatus -> sysUserStatus.getMessage().equals(m))
                    .findFirst()
                    .orElseThrow();
        }
    
        /**
         * 只打印message消息
         * @return
         */
        @Override
        public String toString() {
            return message;
        }
    }
}
