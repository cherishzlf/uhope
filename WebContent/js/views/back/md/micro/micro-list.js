/**
 * ====================================
 * 描述说明
 * @author jiangjialiang<br>2017/03/22
 * @version 1.0.0 
 * ====================================
 */
(function(window, $) {
	var UHope = window.UHope || {};
	
	
	

	// 基于JQuery声明构造函数 ( 无参、有参 )
	jQuery.Line = function() {};

	// 在JQuery的原型上添加函数
	jQuery.Line.prototype = {
		line_init: function() {
			// ...方法体代码
		}
	}
	/* 注: 先声明再添加 */

	// 调用
	jQuery.Line.prototype.line_init();
	
	
	var global_variable = '';	/** 全局变量 */
	var variable = '';			// 局部变量
	
	/**
	 * ------------------------------------
	 * 描述说明
	 * @author jiangjialiang<br>2017/03/22
	 * ------------------------------------
	 */
	
	var UUtil = function(){};
	$.extend(UUtil.prototype, {
		/**
         * 通过JS正则验证手机号码的有效性
         * 验证130-139,150-159,180-189号码段的手机号码
         * @param {String} mobile 手机号
         * @return {boolean} true/false
         */
		uutil_validateMobile: function(mobile) {
        	var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
        	if (!myreg.test(mobile)) {
        		swal('请输入有效的手机号码！');
        		return false;
        	}
        	return true;
        }
	});
	
	/**
	 * -----------------------------------------
	 * jQuery类添加"成员函数"
	 * @author jjl<jiangjialiang@teemax.com.cn>
	 * @remark 
	 * -----------------------------------------
	 */
	$.fn.extend({
		/**
		 * 长度超出规定长度，显示省略号,
		 * 设置class为displayPart,
		 * 设置自定义属，displayLength可显示长度(不包含...),
		 * 双字节字符,长度*2.
		 * @param {String} content 内容
		 * @param {int} len 显示长度
		 * @return {String} result 返回新内容
		 */
        displayPart: function(content, len){
        	var displayLength = len;
            var text = content;
            if (!text) return "";
            var result = "";
            var count = 0;
            for(var i=0; i<displayLength; i++){
                var _char = text.charAt(i);
                if (count >= displayLength) break;
                if (/[^x00-xff]/.test(_char)) count++;	// 双字节字符，[u4e00-u9fa5]中文  
                result += _char;
                count++;  
            }  
            if(result.length < text.length){
                result += "...";
            }
            return result; 
        }
    });
	
	
	$.extend(UHope, {
		UUtil: UUtil
	});
	
	$.extend(window, {
		UHope: UHope
	});

})(window, jQuery);