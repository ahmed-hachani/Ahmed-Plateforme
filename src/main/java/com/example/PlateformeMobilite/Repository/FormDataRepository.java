package com.example.PlateformeMobilite.Repository;

import com.example.PlateformeMobilite.Entity.Form;
import com.example.PlateformeMobilite.Entity.FormData;
import com.example.PlateformeMobilite.Entity.FormField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FormDataRepository extends JpaRepository<FormData,Long> {
    FormData findByFieldAndForm(FormField field, Form form);
    FormData findByUserAndFieldAndForm(Long userId, FormField field, Form form);
    FormData findByUserUserIdAndFieldAndFormFormId(Long userId,FormField field, Long form);

    //FormData findByUser_UserIdAndField_FieldIdAndForm_FormId(Long userId, Long formFieldId, Long formId);
    FormData findByUser_UserIdAndField_FieldId(Long userId, Long formFieldId);







}
