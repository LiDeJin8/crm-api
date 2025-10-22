package com.crm.convert;


import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.ReadConverterContext;
import com.alibaba.excel.converters.WriteConverterContext;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.crm.enums.CustomerLevelEnum;

/**
 * @Author: lenovo
 * @Date: 2025/10/19
 * @Version: 1.0
 */
public class CustomerLevelConverter implements Converter<Integer> {
    @Override
    public Class<?> supportJavaTypeKey() {
        return Integer.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.NUMBER;
    }

    @Override
    public Integer convertToJavaData(ReadConverterContext<?> context) {
        return CustomerLevelEnum.getValueByName(context.getReadCellData().getStringValue());
    }

    @Override
    public WriteCellData<?> convertToExcelData(WriteConverterContext<Integer> context) {
        return new WriteCellData<>(CustomerLevelEnum.getNameByValue(context.getValue()));
    }
}
