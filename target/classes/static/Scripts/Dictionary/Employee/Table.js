//Sự kiện ấn split mở rộng bảng dữ liệu 
//Created by NQHung 11/04/2019
$('.split-btn').click(function () {
            if ($('.tab-detail').height() == 250) { //tab
                $('.grid-content').css('bottom', '26px');
                $('.total-record').css('bottom', '0');
                $('.tab-detail').css('height', '0');//tab
                $('.tab-detail').hide();//tab
                $('.split-btn').css('background', 'transparent url(/Contents/Icons/Common/icon_black_up_arrow.png) no-repeat center center');
            }
            else {
                $('.grid-content').css('bottom', '276px');
                $('.total-record').css('bottom', '250px');
                $('.tab-detail').css('height', '250px'); //tab
                $('.tab-detail').show(); //tab
                $('.split-btn').css('background', 'transparent url(/Contents/Icons/Common/icon_black_down_arrow.png) no-repeat center center');
            }
        });