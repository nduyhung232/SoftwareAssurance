package com.hung;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManageStaffService {
//    ManageStaffSQL manageStaffSQL = new ManageStaffSQL();
//
//    @GetMapping("/getStaffInfo")
//    public ResponseEntity getSataffInfo(){
//
//        return ResponseEntity.ok(manageStaffSQL.getProfile1());
//    }
//
////    @GetMapping("/getStaffAllInfo")
////    public ResponseEntity getSataffAllInfo(){
////
////        return ResponseEntity.ok(manageStaffSQL.getProfileAllField());
////    }
//
//    @PostMapping("/getStaffInfoByMaNV")
//    public ResponseEntity getSataffInfoByMaNV(@RequestBody Profile profile){
//        return ResponseEntity.ok(manageStaffSQL.getProfileByMaNV(profile.getMaNV()));
//    }
//
//    @PostMapping("/updateProfile")
//    public ResponseEntity updateProfile(@RequestBody Profile profile){
//        manageStaffSQL.updateProfile(profile);
//        return ResponseEntity.ok(null);
//    }
}
