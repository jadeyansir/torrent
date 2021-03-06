package com.torrent.zuel.recruitment.exception;


/**
 * 运行时异常
 *
 * @author yan
 * @date 2021/11/18
 */
public class BusinessException extends RuntimeException {
    private final int code;
    private final String message;

    /**
     * 构建 使用exception枚举构建业务exception
     *
     * @param iExceptionEnum exception
     */
    public BusinessException(IExceptionEnum iExceptionEnum) {
        super(iExceptionEnum.getMessage());
        this.code = iExceptionEnum.getCode();
        this.message = iExceptionEnum.getMessage();

    }

    public int getCode() {
        return code;
    }

    /**
     * 构建 业务exception
     *
     * @param code    错误码
     * @param message 错误信息
     */
    public BusinessException(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
