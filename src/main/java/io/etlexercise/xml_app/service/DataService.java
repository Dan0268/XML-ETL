package io.etlexercise.xml_app.service;

import io.etlexercise.xml_app.domain.Data;
import io.etlexercise.xml_app.model.DataDTO;
import io.etlexercise.xml_app.repos.DataRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class DataService {

    private final DataRepository dataRepository;

    public DataService(final DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<DataDTO> findAll() {
        return dataRepository.findAll()
                .stream()
                .map(xMLFile -> mapToDTO(xMLFile, new DataDTO()))
                .collect(Collectors.toList());
    }

    public DataDTO get(final Integer id) {
        return dataRepository.findById(id)
                .map(xMLFile -> mapToDTO(xMLFile, new DataDTO()))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Integer create(final DataDTO dataDTO) {
        final Data xMLFile = new Data();
        mapToEntity(dataDTO, xMLFile);
        return dataRepository.save(xMLFile).getId();
    }

    public void update(final Integer id, final DataDTO dataDTO) {
        final Data xMLFile = dataRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        mapToEntity(dataDTO, xMLFile);
        dataRepository.save(xMLFile);
    }

    public void delete(final Integer id) {
        dataRepository.deleteById(id);
    }

    private DataDTO mapToDTO(final Data data, final DataDTO dataDTO) {
        dataDTO.setId(data.getId());
        dataDTO.setItemNum(data.getItemNum());
        dataDTO.setSubItemNum(data.getSubItemNum());
        dataDTO.setItemStartDate(data.getItemStartDate());
        dataDTO.setItemEndDate(data.getItemEndDate());
        dataDTO.setCategory(data.getCategory());
        dataDTO.setGroup(data.getGroup());
        dataDTO.setSubGroup(data.getSubGroup());
        dataDTO.setSubHeading(data.getSubHeading());
        dataDTO.setItemType(data.getItemType());
        dataDTO.setFeeType(data.getFeeType());
        dataDTO.setProviderType(data.getProviderType());
        dataDTO.setNewItem(data.getNewItem());
        dataDTO.setItemChange(data.getItemChange());
        dataDTO.setAnaesChange(data.getAnaesChange());
        dataDTO.setDescriptorChange(data.getDescriptorChange());
        dataDTO.setFeeChange(data.getFeeChange());
        dataDTO.setEMSNChange(data.getEMSNChange());
        dataDTO.setEMSNCap(data.getEMSNCap());
        dataDTO.setBenefitType(data.getBenefitType());
        dataDTO.setBenefitStartDate(data.getBenefitStartDate());
        dataDTO.setFeeStartDate(data.getFeeStartDate());
        dataDTO.setScheduleFee(data.getScheduleFee());
        dataDTO.setBenefit75(data.getBenefit75());
        dataDTO.setBenefit85(data.getBenefit85());
        dataDTO.setBenefit100(data.getBenefit100());
        dataDTO.setBasicUnits(data.getBasicUnits());
        dataDTO.setEMSNStartDate(data.getEMSNStartDate());
        dataDTO.setEMSNEndDate(data.getEMSNEndDate());
        dataDTO.setEMSNFixedCapAmount(data.getEMSNFixedCapAmount());
        dataDTO.setEMSNMaximumCap(data.getEMSNMaximumCap());
        dataDTO.setEMSNPercentageCap(data.getEMSNPercentageCap());
        dataDTO.setEMSNDescription(data.getEMSNDescription());
        dataDTO.setEMSNChangeDate(data.getEMSNChangeDate());
        dataDTO.setAnaes(data.getAnaes());
        dataDTO.setDerivedFeeStartDate(data.getDerivedFeeStartDate());
        dataDTO.setDerivedFee(data.getDerivedFee());
        dataDTO.setDescriptionStartDate(data.getDescriptionStartDate());
        dataDTO.setDescription(data.getDescription());
        dataDTO.setQFEStartDate(data.getQFEStartDate());
        dataDTO.setQFEEndDate(data.getQFEEndDate());
        return dataDTO;
    }

    private Data mapToEntity(final DataDTO dataDTO, final Data data) {
        data.setItemNum(dataDTO.getItemNum());
        data.setSubItemNum(dataDTO.getSubItemNum());
        data.setItemStartDate(dataDTO.getItemStartDate());
        data.setItemEndDate(dataDTO.getItemEndDate());
        data.setCategory(dataDTO.getCategory());
        data.setGroup(dataDTO.getGroup());
        data.setSubGroup(dataDTO.getSubGroup());
        data.setSubHeading(dataDTO.getSubHeading());
        data.setItemType(dataDTO.getItemType());
        data.setFeeType(dataDTO.getFeeType());
        data.setProviderType(dataDTO.getProviderType());
        data.setNewItem(dataDTO.getNewItem());
        data.setItemChange(dataDTO.getItemChange());
        data.setAnaesChange(dataDTO.getAnaesChange());
        data.setDescriptorChange(dataDTO.getDescriptorChange());
        data.setFeeChange(dataDTO.getFeeChange());
        data.setEMSNChange(dataDTO.getEMSNChange());
        data.setEMSNCap(dataDTO.getEMSNCap());
        data.setBenefitType(dataDTO.getBenefitType());
        data.setBenefitStartDate(dataDTO.getBenefitStartDate());
        data.setFeeStartDate(dataDTO.getFeeStartDate());
        data.setScheduleFee(dataDTO.getScheduleFee());
        data.setBenefit75(dataDTO.getBenefit75());
        data.setBenefit85(dataDTO.getBenefit85());
        data.setBenefit100(dataDTO.getBenefit100());
        data.setBasicUnits(dataDTO.getBasicUnits());
        data.setEMSNStartDate(dataDTO.getEMSNStartDate());
        data.setEMSNEndDate(dataDTO.getEMSNEndDate());
        data.setEMSNFixedCapAmount(dataDTO.getEMSNFixedCapAmount());
        data.setEMSNMaximumCap(dataDTO.getEMSNMaximumCap());
        data.setEMSNPercentageCap(dataDTO.getEMSNPercentageCap());
        data.setEMSNDescription(dataDTO.getEMSNDescription());
        data.setEMSNChangeDate(dataDTO.getEMSNChangeDate());
        data.setAnaes(dataDTO.getAnaes());
        data.setDerivedFeeStartDate(dataDTO.getDerivedFeeStartDate());
        data.setDerivedFee(dataDTO.getDerivedFee());
        data.setDescriptionStartDate(dataDTO.getDescriptionStartDate());
        data.setDescription(dataDTO.getDescription());
        data.setQFEStartDate(dataDTO.getQFEStartDate());
        data.setQFEEndDate(dataDTO.getQFEEndDate());
        return data;
    }

}
