//Thao tác với đối tượng nhân viên
//Created by NQHung 04/04/2019

$(document).ready(function () {
    //Thực hiện Load dữ liệu lên bảng
    employeeJS.LoadDataConfig();
    // employeeJS.LoadData();

});
//Class đối tượng nhân viên
// Created by NQHung 04/04/2019
class Employee {
    //Khai báo constructor
    constructor() {
        this.InitEvents();
    };

    //Thêm Event cho các button
    InitEvents() {
        //Sự kiện Click Button Lưu
        $('#btn-save').click(function () {
            employeeJS.addEmployee();
            employeeJS.LoadData();
        });
        //Sự kiện Click Button Lưu Config
        $('#btn-save-config').click(function () {
            employeeJS.addConfig();
            employeeJS.LoadDataConfig();
        });
        //Sự kiện Click Button Them Cau Hinh
        $('#btn-add-config').click(function () {
            employeeJS.showAddConfigForm();
            employeeJS.clearInput();
        });
        //Sự kiện Click Button Thêm
        $('#btn-add').click(function () {
            employeeJS.showAddForm();
            employeeJS.clearInput();
        });
        //Sự kiện Click Button Xóa
        $('#btn-delete').click(function () {
            employeeJS.deleteEmployee();
        });
        //Sự kiện Click button thêm và sửa
        $('#btn-view-edit').click(function () {
            debugger
            employeeJS.editEmployee();
        });
        //Sự kiện click Button Đóng Ẩn Form Thêm
        $('#btn-close').click(function () {
            employeeJS.hideFormAdd();
            employeeJS.LoadData();
        });
        //Sự kiện click Icon Ẩn hiện Menu trên sidebar
        $('#h-icon-toogle').click(function () {
            $('.sidebar-item-title').hide();
            $('#sidebar').css("width", "40px");
            $('.sidebar-item-title').css("height", "0");

        });
        // Sự kiện click vào một dòng tỏng table thì dòng đó được active
        $('table tbody').on('click', 'tr', function () {
            $(this).addClass('table-primary').siblings().removeClass('table-primary');
        });
    }

    //Hàm LoadData() load dữ liệu lên table
    LoadData() {
        $("table tbody").empty();
        $.ajax({
            type: "GET",
            contentType: "application/json",
            url: "/getList",
            dataType: 'json',
            cache: false,
            timeout: 600000,
            success: function (response) {
                if (response.length > 0) {
                    $.each(response, function (index, item) {
                        //Lấy tất cả các field dữ liệu
                        var fields = $(".column-title");
                        var recordId = $('table').attr('recordId');
                        var rowHTML = $('<tr rowId="' + item[recordId] + '"></tr>');
                        $.each(fields, function (index, field) {
                            var rowColumn = $("<td></td>");
                            var dataName = $(field).attr('dataTitle');
                            var dataType = $(field).attr('dataType');
                            dataType = dataType ? dataType.toLowerCase() : null;
                            //Xử lý khi dữ liệu rỗng
                            var value = item[dataName] ? item[dataName] : "";
                            switch (dataType) {
                                case "date":
                                    var dateString = "";
                                    if (value) {
                                        value = new Date(value);
                                        //fomat định dạng ngày tháng
                                        dateString = value.formatddMMyyyy();
                                    }
                                    rowColumn = rowColumn.append('<div class="text-center  p-2">' + dateString + '</div>');
                                    break;
                                case "number":

                                    rowColumn = rowColumn.append('<div class="text-center p-2">' + value + '</div>');
                                    break;
                                //case "boolean":
                                //    rowColumn = rowColumn.append('<div class="text-right">' + value + '</div>');
                                //    break;
                                default:
                                    rowColumn = rowColumn.append('<div class="text-left p-2">' + value + '</div>');
                            }
                            rowHTML = rowHTML.append(rowColumn);
                        })

                        $("table tbody").append(rowHTML);
                    });
                }
            },
            error: function (response) {
                console.log("Có lỗi xảy ra tại API list nhân viên")
            }
        });
    }

    LoadDataConfig() {
        debugger
        $("table tbody").empty();
        $.ajax({
            type: "GET",
            contentType: "application/json",
            dataType: 'json',
            cache: false,
            timeout: 600000,
            url: "/getListConfig",
            success: function (response) {
console.log("ggg")

                    $.each(response, function (index, item) {
                        //Lấy tất cả các field dữ liệu
                        var fields = $(".column-title");
                        var recordId = $('table').attr('recordId');
                        var rowHTML = $('<tr rowId="' + item[recordId] + '"></tr>');
                        $.each(fields, function (index, field) {
                            var rowColumn = $("<td></td>");
                            var dataName = $(field).attr('dataTitle');
                            var dataType = $(field).attr('dataType');
                            dataType = dataType ? dataType.toLowerCase() : null;
                            //Xử lý khi dữ liệu rỗng
                            var value = item[dataName] ? item[dataName] : "";
                            switch (dataType) {
                                case "date":
                                    var dateString = "";
                                    if (value) {
                                        value = new Date(value);
                                        //fomat định dạng ngày tháng
                                        dateString = value.formatddMMyyyy();
                                    }
                                    rowColumn = rowColumn.append('<div class="text-center  p-2">' + dateString + '</div>');
                                    break;
                                case "number":

                                    rowColumn = rowColumn.append('<div class="text-center p-2">' + value + '</div>');
                                    break;
                                //case "boolean":
                                //    rowColumn = rowColumn.append('<div class="text-right">' + value + '</div>');
                                //    break;
                                default:
                                    rowColumn = rowColumn.append('<div class="text-left p-2">' + value + '</div>');
                            }
                            rowHTML = rowHTML.append(rowColumn);
                        })

                        $("table tbody").append(rowHTML);
                    });

            },
            error: function (response) {
                console.log("Có lỗi xảy ra tại API list nhân viên")
            }
        });
    }

    addConfig() {
        var inputs = $('.info-row input');
        var obj = {};
        $.each(inputs, function (index, input) {
            var fieldName = $(input).attr("name");
            var fieldData = $(input).val();
            obj[fieldName] = fieldData;
        });

        var url = '/config/add';
        console.log(obj);
        $.ajax({
            contentType: "application/json",
            url: url,
            method: "POST",
            dataType: "json",
            data: JSON.stringify(obj),
            success: function (response) {
                employeeJS.LoadData();
            },
            error: function (response) {
                console.log("Có lỗi xảy ra tại API Add Config")
            }
        });
    }

    addEmployee() {
        var inputs = $('.info-row input');
        var obj = {};
        $.each(inputs, function (index, input) {
            var fieldName = $(input).attr("name");
            var fieldData = $(input).val();
            obj[fieldName] = fieldData;
        });

        var url = '/person/add';
        console.log(obj);
        $.ajax({
            contentType: "application/json",
            url: url,
            method: "POST",
            dataType: "json",
            data: JSON.stringify(obj),
            success: function (response) {
                employeeJS.LoadData();
            },
            error: function (response) {
                console.log("Có lỗi xảy ra tại API Add Nhân viên")
            }
        });
    }

    editEmployee() {
        // Lấy bản ghi đang chọn
        var record = $('table tbody .table-primary');
        var recordId = $(record).attr('rowId');
        // Lấy dữ liệu trên server
        $.ajax({
            url: "/employees/" + recordId,
            method: "GET",
            success: function (response) {
                //Binding data
                var inputs = $('.info-row input');
                var obj = response;
                $.each(inputs, function (index, input) {
                    var fieldName = $(input).attr("name");
                    $(input).val(obj[fieldName]);
                });
                employeeJS.showAddForm();
            },
            error: function (response) {
                console.log("Có lỗi xảy ra tại API sửa Nhân viên")
            }
        });
        //Binding dữ liệu vào form
    }

    //Phương thức để thực hiện việc xóa nhân viên
    clearInput() {
        var fields = $('.info-row input');
        $.each(fields, function (index, item) {
            item.value = "";
        });
    }

    deleteEmployee() {
        var record = $('table tbody .table-primary');
        var id = $(record).attr('rowId');
        $.ajax({
            type: 'POST',
            url: '/employees/' + id + '/delete',
            dataType: 'json',
            success: function () {
                alert('Xóa thành công');
                employeeJS.LoadData()
            },
            error: function () {
                alert('Có lỗi sảy ra');
            }
        });

    }

    showAddForm() {
        $('.content-add').show();
        $('.content-list').hide();
        $('.data-content').hide();
    }

    showAddConfigForm() {
        $('.content-add-config').show();
        $('.content-list').hide();
        $('.data-content').hide();
    }

    hideFormAdd() {
        $('.content-add').hide();
        $('.content-list').show();
    }
}

var employeeJS = new Employee();