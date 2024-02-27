package service;

import entities.Clazz;
import entities.TechMaster;

import java.util.Scanner;

public class TechMasterService {
    ClazzService clazzService = new ClazzService();

    public TechMaster inputTechMaster(){
        System.out.println("Nhập tên quản lý lớp: ");
        String nameMN = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên giáo viên: ");
        String teacher = new Scanner(System.in).nextLine();
        Clazz clazz = clazzService.inputClazz();

        return new TechMaster(nameMN,teacher,clazz);
    }

    public void outPutTeachMaster(TechMaster techMaster){
        System.out.println(techMaster);
    }

}
