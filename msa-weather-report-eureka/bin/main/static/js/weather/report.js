/**
 * report 下拉框实现
 */

$(function(){
	$("#selectCityId").change(function(){
		var cityName = $("#selectCityId").val();
		var url = "/reporter/cityName/" + cityName;
		window.location.href = url;
	});
})