$(document).ready(function () {
    //Tạo datepicker cho birthday trong form thêm
    formJS.CreateDatePicker("#birthday");
    formJS.CreateDatePicker(".datepicker");
    formJS.CreateDatePicker("#date-expect");
    formJS.CreateDatePicker("#datebirthday");
})
class Form {
    constructor() {

    }
    InitsInput() {
       
    }

    CreateDatePicker(selected) {
        $(selected).datepicker({
            showOn: "button",
            buttonImage: "/Contents/Icons/Common/Calendar.png",
            buttonText: "Chọn ngày",
            dateFormat: "dd/mm/yy",
            buttonImageOnly: true,
            showButtonPanel: true

        });
    };
}
//Bắt focus cho thẻ input
$('.emp-input .input-border').focus(function () {
    $(this).parent().css("border-color", "#157fcc");
})
$('.emp-input .input-border').blur(function () {
    $(this).parent().css("border-color", "#d9d9d9");
})
//Băt lỗi validate
$('.emp-input .input-required').blur(function (e) {
    if ($(this).val().trim() == '') {
        $(this).parent().css({ "border": "1px solid #cf4c35" });
    }
    else if ($(this).change()) {
        if ($(this).val() != '') {
            $(this).parent().css({ "border": "1px solid #ccc" });
        }
    }
});
$('.emp-input .input-required').keyup(function (e) {
    if ($(this).val().trim() == '') {

        $(this).parent().css({ "border": "1px solid #0071c1" });
    }
    else {
        $(this).parent().css({ "border": "1px solid #0071c1" });
    }
});
//Check box 

var formJS = new Form();