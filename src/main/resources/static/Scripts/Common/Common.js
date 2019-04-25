$(document).ready(function () {
    var isOpen = false;

    showDropdown('#show-genderName', genderValue, '#btn-gender');
    showDropdown('#show-jobPosition', jobPosition, '#btn-jobPosition');
    //Trình độ đào tạo 

    showDropdown('#show-level', level, '#btn-level');
    //Nơi đào tạo 
    showDropdown('#show-trainningplace', trainningPlace, '#btn-trainningplace');
    //KHoa 
    showDropdown('#show-major', major, '#btn-major');
    //Status header
    showDropdown('#show-status-header', statusHeader, '#btn-status-header');
    // TT hôn nhân
    showDropdown('#show-rela', relationship, '#btn-rela');
    // TT gia đình
    showDropdown('#show-family', family, '#btn-family');
    //TT bản thân

    //Dân tộc 
    showDropdown('#show-nation', nation, '#btn-nation');
    //Resize kích thước column Table
    resizeTable();

})

//Các hàm định dạng dữ liệu

//Hàm định dạng thời gian dd-mm-yyyy
//Created by NQHung 04/04/2019
Date.prototype.formatddMMyyyy = function () {
    var day = this.getDate();
    var month = this.getMonth() + 1;
    var year = this.getFullYear();
    return day + '/' + month + '/' + year;
}
//Hàm định dạng thời gian mm-dd-yyyy
//Created by NQHung 04/04/2019

Date.prototype.formatMMddyyyy = function () {
    var day = this.getDate();
    var month = this.getMonth() + 1;
    var year = this.getFullYear();
    return month + '-' + day + '-' + year;
}
//Hàm định dạng tiền tệ
//Created by NQHung 04/04/2019

Number.prototype.formatMoney = function () {
    return this.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.");
}
// Hàm chỉnh độ rộng column trong table
//Created by NQHung 04/04/2019
function  resizeTable() {
        var thHeight = $("table#demo-table th:first").height();
    $("table#demo-table th").resizable({
        handles: "e",
        minHeight: thHeight,
        maxHeight: thHeight,
        //minWidth: 20,
        resize: function (event, ui) {
            var sizerID = "#" + $(event.target).attr("id") + "-sizer";
            $(sizerID).width(ui.size.width);
        }
    });
}
function showDropdown(input, source, btn) {
    $(input).autocomplete({
        source: source,
        minLength: 0,
        open: function (event, ui) {
            isOpen = true;
        },
        select: function (event, ui) {
            isOpen = false;
        }
    });
    $(btn).click(function (event) {
        $(input).focus();
        if (isOpen) {

            $(input).autocomplete("close");
            isOpen = false;
        } else {
            $(input).autocomplete("search", "");
            event.stopImmediatePropagation();
        }
        $('ul').width($(input).parent().width());
    });
    $(window).click(function () {
        $(input).autocomplete("close");
        isOpen = false;
    });
}

///Autocomplete  Resource
var statusHeader = [
    "Tất cả",
    "Đang làm việc",
    "Đã nghỉ việc",
    "Chưa kích hoạt tài khoản",
    "Đã kích hoạt tài khoản"
]
var languageValue = [
    "Tiếng Việt (Tiếng Việt)",
    "English (Tiếng Anh)",
    "Deutsch (Tiếng Đức)"
];
var genderValue = [
    "Nam",
    "Nữ"
];
var level = [
    "Đại học",
    "Cao đẳng",
    "Trung cấp",
    "Thạc sĩ",
    "Tiến sĩ",
    "Trung học phổ thông",
    "Trung học cơ sở",
    "Tiểu học",
    "Nghề",
    "Cao đẳng nghề",
    "Trung cấp nghề"
];
var trainningPlace = [
    	
   " ĐH Bách Khoa Hà Nội",
   " ĐH Đông Đô",
   " ĐH Công nghệ - ĐH QG Hà Nội",
   " ĐH Phương Đông",
   " Học viện Kỹ thuật Quân sự",
   " ĐH Công nghiệp Hà Nội",
   " Học viện Kỹ thuật Mật mã",
   " ĐH Công nghiệp Việt – Hung",
   " Học viện Công nghệ Bưu chính Viễn thông",
   " ĐH Mỏ Địa chất",
   " ĐH FPT",
   " ĐH Hà Nội",
   " ĐH Hòa Bình",
   " ĐH Sư phạm Hà Nội",
   " ĐH Thủy lợi ",
   " Học viện Quản lý Giáo dục",
   " ĐH Điện lực",
   " ĐH Kinh doanh và Công nghệ Hà Nội",
   " ĐH Thăng Long",
   " ĐH Quốc tế Bắc Hà",
   " ĐH Giao thông vận tải",
   " ĐH Thành Tây",
   " ĐH Công nghệ Giao thông vận tải",
   " ĐH Thành Đô",
   " ĐH Xây dựng",
   " Viện ĐH Mở"
]
var major = [
    "Công nghệ thông tin",
    "Hệ thống thông tin",
    "Kỹ thuật phần mềm",
    "Khoa học máy tính"
]
var jobPosition = [
    "Chính thức",
    "Thử việc"
];
var statusFilter = [
    "--Tất cả--",
    "Đang làm việc",
    "Chính thức",
    "Thử việc",
    "Nghỉ việc"
];

var relationship = [
    "Độc thân",
    "Đã có gia đình",
    "Chưa xác định",
    "Ly dị"
];
var family = [
    "Nông dân",
    "Công chức",
    "Bần nông",
    "Tiểu thương",
    "Công nhân",
    "Bộ đội",
    "Trung nông",
    "Viên chức",
    "Khác"
];
var nation = [
    "Kinh",
    "Tày",
    "Thái",
    "Mường",
    "Dao",
    "Ba na",
    "HMong",
    "Ê đê",
    "Xơ Đăng"
];