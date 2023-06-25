package com.exam.Result;

/**
 * Api结果集处理
 */
public class ApiResultHandler {

    /**
     * 静态方法
     * @param object
     * @return ApiResult
     */
    public static ApiResult success(Object object) {
        ApiResult apiResult = new ApiResult();
        apiResult.setData(object);
        apiResult.setCode(200);
        apiResult.setMessage("请求成功");
        return apiResult;
    }

    public static ApiResult success() {
        return success(null);
    }

    public static <T> ApiResult buildApiResult(Integer code, String message, T data) {
        ApiResult apiResult = new ApiResult();


        apiResult.setCode(code);
        apiResult.setMessage(message);
        apiResult.setData(data);
        return apiResult;
    }
}
