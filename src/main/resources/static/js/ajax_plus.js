//首先备份下jquery的ajax方法
let _ajax = $.ajax;
// 重写jquery的ajax方法
$.ajax = function(opt) {
    // 备份opt中error和success方法
    let fn = {
        error : function(XMLHttpRequest, textStatus, errorThrown) {
        },
        success : function(data, textStatus) {
        }
    }
    if (opt.error) {
        fn.error = opt.error;
    }
    if (opt.success) {
        fn.success = opt.success;
    }

    // 扩展增强处理
    let _opt = $.extend(opt, {
        error : function(XMLHttpRequest, textStatus, errorThrown) {
            // 错误方法增强处理
            fn.error(XMLHttpRequest, textStatus, errorThrown);
        },
        success : function(data, textStatus) {
            if (data.message != 'SESSION_OUT') {
                fn.success(data, textStatus)
                return false;
            } else {
                window.top.location.href = "./index.html" ;
            }
        }
    });
    return _ajax(_opt);
};