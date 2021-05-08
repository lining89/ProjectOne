package com.springboot.rabbit.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author Yan Jingchao
 */

@Component
public class Messages {

    private final MessageSource messageSource;
    /**
     * 服务调用成功
     */
    public static final Integer CODE_200000 = 200000;
    /**
     * 错误的请求
     */
    public static final Integer CODE_400000 = 400000;
    /**
     * 用户不存在
     */
    public static final Integer CODE_400001 = 400001;
    /**
     * 密码错误
     */
    public static final Integer CODE_400002 = 400002;
    /**
     * 签名验证失败
     */
    public static final Integer CODE_400003 = 400003;

    /**
     * 请求的服务不存在
     */
    public static final Integer CODE_400004 = 400004;
    /**
     * {？}请求参数是必须项目，不能为空
     */
    public static final Integer CODE_400005 = 400005;
    /**
     * {？}请求参数类型错误
     */
    public static final Integer CODE_400006 = 400006;
    /**
     * 未定义的请求参数{？}
     */
    public static final Integer CODE_400007 = 400007;
    /**
     * {？}请求参数数值格式错误
     */
    public static final Integer CODE_400008 = 400008;

    /**
     * {？}请求参数数值超出业务范围
     */
    public static final Integer CODE_400009 = 400009;
    /**
     * 无法处理请求，原因：{？}
     */
    public static final Integer CODE_400010 = 400010;
    /**
     * 无效的订单：{ ? }
     */
    public static final Integer CODE_400101 = 400101;
    /**
     * 该订单不存在：{ ? }
     */
    public static final Integer CODE_400102 = 400102;

    /**
     * 支付金额必须小于等于电商系统订单的未支付金额
     */
    public static final Integer CODE_400103 = 400103;
    /**
     * 该订单及支付流水已经存在
     */
    public static final Integer CODE_400104 = 400104;
    /**
     * 查询订单时间间隔不能大于{ ? }天
     */
    public static final Integer CODE_400105 = 400105;
    /**
     * 存在待完成的订单
     */
    public static final Integer CODE_400106 = 400106;


    /**
     * 服务器系统异常
     */
    public static final Integer CODE_500000 = 500000;

    /**
     * 传入的JSON数据格式错误
     */
    public static final Integer CODE_500001 = 500001;
    /**
     * 服务调用失败，原因:{？}
     */
    public static final Integer CODE_500002 = 500002;

    /**
     * 用户手机号{？}已经存在
     */
    public static final Integer CODE_500100 = 500100;
    /**
     * 用户名{？}已经存在
     */
    public static final Integer CODE_500101 = 500101;
    /**
     * 密码和确认密码不一致
     */
    public static final Integer CODE_500102 = 500102;
    /**
     * {?}数据格式错误
     */
    public static final Integer CODE_500103 = 500103;
    /**
     * 验证码错误
     */
    public static final Integer CODE_500104 = 500104;
    /**
     * 验证码已过期
     */
    public static final Integer CODE_500105 = 500105;
    /**
     * 上传图片失败
     */
    public static final Integer CODE_500106 = 500106;
    /**
     * 上传文件格式不整确
     */
    public static final Integer CODE_500107 = 500107;
    /**
     * 上传文件失败
     */
    public static final Integer CODE_500108 = 500108;
    /**
     * 上传图片不能超过{?}张
     */
    public static final Integer CODE_500109 = 500109;
    /**
     * 参数数据超过允许长度:{?}
     */
    public static final Integer CODE_500110 = 500110;

    /**
     * 商品已经被关注过
     */
    public static final Integer CODE_500111 = 500111;
    /**
     * 商品已关注失败
     */
    public static final Integer CODE_500112 = 500112;
    /**
     * 取消关注失败
     */
    public static final Integer CODE_500113 = 500113;

    /**
     * 该商品库存不足
     */
    public static final Integer CODE_500114 = 500114;
    /**
     * {?} 商品超出配送范围
     */
    public static final Integer CODE_500115 = 500115;

    /**
     * {?} 无商品详情数据
     */
    public static final Integer CODE_500116 = 500116;
    /**
     * 商品名称>30
     */
    public static final Integer CODE_500117 = 500117;
    /**
     * 权限不足，无法执行此操作
     */
    public static final Integer CODE_500200 = 500200;
    /**
     * 权限不足，无法查看该信息
     */
    public static final Integer CODE_500201 = 500201;

    /**
     * 服务调用成功
     */
    public static final Integer CODE_10000 = 10000;
    /**
     * 服务调用成功，但没有找到相应数据
     */
    public static final Integer CODE_10001 = 10001;

    /**
     * 通用未知错误
     */
    public static final Integer CODE_20000 = 20000;
    /**
     * 必填参数为空
     */
    public static final Integer CODE_20001 = 20001;
    /**
     * 参数无法正确解析
     */
    public static final Integer CODE_20002 = 20002;
    /**
     * 参数超出允许范围
     */
    public static final Integer CODE_20003 = 20003;
    /**
     * 签名验证失败
     */
    public static final Integer CODE_20004 = 20004;
    /**
     * 请求的服务不存在
     */
    public static final Integer CODE_20005 = 20005;

    /**
     * 请求参数类型错误
     */
    public static final Integer CODE_20006 = 20006;
    /**
     * 请求参数数值格式错误
     */
    public static final Integer CODE_20007 = 20007;

    /**
     * 服务器系统异常
     */
    public static final Integer CODE_20008 = 20008;
    /**
     * 传入的JSON数据格式错误
     */
    public static final Integer CODE_20009 = 20009;

    /**
     * 参数数据超过允许长度
     */
    public static final Integer CODE_20010 = 20010;
    /**
     * 权限不足，无法执行此操作
     */
    public static final Integer CODE_20011 = 20011;
    /**
     * 第{?}行必填参数有空值
     */
    public static final Integer CODE_20013 = 20013;

    /**
     * 上传图片失败
     */
    public static final Integer CODE_30001 = 30001;
    /**
     * 上传文件格式不正确
     */
    public static final Integer CODE_30002 = 30002;
    /**
     * 上传文件失败
     */
    public static final Integer CODE_30003 = 30003;
    /**
     * 上传图片不能超过{?}张
     */
    public static final Integer CODE_30004 = 30004;
    /**
     * 上传图片大小不能超过{?}M
     */
    public static final Integer CODE_30005 = 30005;

    /**
     * 导出数据失败
     */
    public static final Integer CODE_30006 = 30006;
    /**
     * 导出的列名无效
     */
    public static final Integer CODE_30007 = 30007;
    /**
     * 导出的excel格式不正确
     */
    public static final Integer CODE_30008 = 30008;
    /**
     * 压缩文件格式不正确
     */
    public static final Integer CODE_30009 = 30009;
    /**
     * 压缩文件太大
     */
    public static final Integer CODE_30010 = 30010;
    /**
     * 压缩文件为空
     */
    public static final Integer CODE_30011 = 30011;
    /**
     * 压缩文件不存在
     */
    public static final Integer CODE_30012 = 30012;
    /**
     * 无效的订单
     */
    public static final Integer CODE_40001 = 40001;
    /**
     * 该订单不存在
     */
    public static final Integer CODE_40002 = 40002;

    /**
     * 支付金额必须小于等于电商系统订单的未支付金额
     */
    public static final Integer CODE_40003 = 40003;
    /**
     * 该订单及支付流水已经存在
     */
    public static final Integer CODE_40004 = 40004;
    /**
     * 查询订单时间间隔不能大于{ ? }天
     */
    public static final Integer CODE_40005 = 40005;
    /**
     * 商品超出配送范围
     */
    public static final Integer CODE_40006 = 40006;
    /**
     * 该订单已取消：{ ? }
     */
    public static final Integer CODE_40008 = 40008;
    /**
     * 该订单已发货：{ ? }
     */
    public static final Integer CODE_40007 = 40007;
    /**
     * 优惠或减免金额不能小于0
     */
    public static final Integer CODE_40009 = 40009;
    /**
     * 该用户下没有该订单
     */
    public static final Integer CODE_40010 = 40010;
    /**
     * 购买数量低于最小购买量
     */
    public static final Integer CODE_40011 = 40011;
    /**
     * 商品购买超过最大购买数量
     */
    public static final Integer CODE_40012 = 40012;
    /**
     * 未找到购买数量对应的阶梯价格
     */
    public static final Integer CODE_40013 = 40013;
    /**
     * 一共购买的商品总额超过20万
     */
    public static final Integer CODE_40014 = 40014;
    /**
     * 库存不足
     */
    public static final Integer CODE_40015 = 40015;
    /**
     * 该订单下无商品
     */
    public static final Integer CODE_40016 = 40016;
    /**
     * 该地址不属于该用户
     */
    public static final Integer CODE_40017 = 40017;
    /**
     * 没有符合条件的数据
     */
    public static final Integer CODE_40018 = 40018;
    /**
     * 优惠或减免金额必须小于订单的未支付金额
     */
    public static final Integer CODE_40019 = 40019;
    /**
     * 发货商品数量超过订单商品数量
     */
    public static final Integer CODE_40020 = 40020;
    /**
     * 线上付款记录不能手动确认
     */
    public static final Integer CODE_40021 = 40021;

    /**
     * 该流水号不存在：{ ? }
     */
    public static final Integer CODE_40022 = 40022;

    /**
     * 该流水号支付不成功：{ ? }
     */
    public static final Integer CODE_40023 = 40023;

    /**
     * 支付金额必须小于等于电商系统订单的未支付金额：{ ? }
     */
    public static final Integer CODE_40024 = 40024;

    /**
     * 混批商品请满足混批条件或起批量
     */
    public static final Integer CODE_40025 = 40025;

    /**
     * 商品已经被关注过
     */
    public static final Integer CODE_50001 = 50001;
    /**
     * 商品已关注失败
     */
    public static final Integer CODE_50002 = 50002;
    /**
     * 取消关注失败
     */
    public static final Integer CODE_50003 = 50003;
    /**
     * 该商品库存不足
     */
    public static final Integer CODE_50004 = 50004;

    /**
     * 未设置有效时间天数
     */
    public static final Integer CODE_50005 = 50005;
    /**
     * 已经达到当日可发布数量上限
     */
    public static final Integer CODE_50006 = 50006;
    /**
     * 用户隶属店铺和商品隶属店铺不一致
     */
    public static final Integer CODE_50007 = 50007;
    /**
     * 用户ID无效,不能发布商品
     */
    public static final Integer CODE_50008 = 50008;

    /**
     * 发布未设置有效时间天数
     */
    public static final Integer CODE_50009 = 50009;
    /**
     * 已经达到当日可发布数量上限
     */
    public static final Integer CODE_50010 = 50010;
    /**
     * 用户隶属店铺和商品隶属店铺不一致
     */
    public static final Integer CODE_50011 = 50011;

    /**
     * 活动正在进行中，不能进行删除
     */
    public static final Integer CODE_50012 = 50012;
    /**
     * 活动开始时间必须大于当前时间
     */
    public static final Integer CODE_50013 = 50013;
    /**
     * 报名结束时间必须早于活动结束时间至少一天
     */
    public static final Integer CODE_50014 = 50014;
    /**
     * 当前活动必须是未发布活动，且活动id必须存在
     */
    public static final Integer CODE_50015 = 50015;
    /**
     * 当前活动商品不存在或状态异常
     */
    public static final Integer CODE_50016 = 50016;

    /**
     * 无商品详情数据
     */
    public static final Integer CODE_80001 = 80001;
    /**
     * 商品已下架
     */
    public static final Integer CODE_80002 = 80002;
    /**
     * 商品选购量大于允许购买上限
     */
    public static final Integer CODE_80003 = 80003;
    /**
     * 对应商品GoodsCommonid集合中的商品状态不统一，有已经审核的商品
     */
    public static final Integer CODE_80004 = 80004;
    /**
     * 对应商品GoodsCommonid集合中的商品状态非法操作
     */
    public static final Integer CODE_80005 = 80005;
    /**
     * 类型已有商品咨询，不可删除
     */
    public static final Integer CODE_80006 = 80006;
    /**
     * 商品不存在或商品信息已修改
     */
    public static final Integer CODE_80007 = 80007;
    /**
     * 部分商品不是审核通过状态
     */
    public static final Integer CODE_80008 = 80008;
    /**
     * 3级类目不能作为父级类目存在
     */
    public static final Integer CODE_80009 = 80009;
    /**
     * 不能跨级设置父级类目
     */
    public static final Integer CODE_80010 = 80010;
    /**
     * 属性已经绑定类型，不可删除
     */
    public static final Integer CODE_80011 = 80011;
    /**
     * 类型已绑定分类，不可删除
     */
    public static final Integer CODE_80012 = 80012;
    /**
     * 属性类型不可修改
     */
    public static final Integer CODE_80013 = 80013;
    /**
     * 属性名称不能相同
     */
    public static final Integer CODE_80014 = 80014;
    /**
     * 属性名称不能相同
     */
    public static final Integer CODE_80015 = 80015;
    /**
     * 商品条形码不能相同
     */
    public static final Integer CODE_80016 = 80016;

    /**
     * 商品规格条形码不能重复
     */
    public static final Integer CODE_80017 = 80017;
    /**
     * 时间必须为当前时间之后
     */
    public static final Integer CODE_80018 = 80018;
    /**
     * 时间为必填项
     */
    public static final Integer CODE_80019 = 80019;
    /**
     * 店铺状态异常
     */
    public static final Integer CODE_90001 = 90001;
    /**
     * 供应商店铺已存在
     */
    public static final Integer CODE_90002 = 90002;
    /**
     * 供应商店铺审核失败
     */
    public static final Integer CODE_90003 = 90003;
    /**
     * 店铺不存在
     */
    public static final Integer CODE_90004 = 90004;
    /**
     * 店铺服务状态不正常
     */
    public static final Integer CODE_90005 = 90005;
    /**
     * 服务处于公示期之间
     */
    public static final Integer CODE_90006 = 90006;

    /**
     * 该商品已经收藏过
     */
    public static final Integer CODE_110001 = 110001;
    /**
     * 该店铺已经收藏过
     */
    public static final Integer CODE_110002 = 110002;

    /**
     * 广告位id不存在
     */
    public static final Integer CODE_120001 = 120001;
    /**
     * 该广告位为单广告位，已经存在广告内容
     */
    public static final Integer CODE_120002 = 120002;
    /**
     * 该物流公司已经存在
     */
    public static final Integer CODE_120003 = 120003;
    /**
     * 类型已有合同咨询，不可删除
     */
    public static final Integer CODE_120004 = 120004;
    /**
     * 类型名称已存在
     */
    public static final Integer CODE_120005 = 120005;
    /**
     * 分类已发布商品，不可删除
     */
    public static final Integer CODE_130001 = 130001;

    /**
     * 分类包含子分类，不可删除
     */
    public static final Integer CODE_130002 = 130002;

    /**
     * 渠道类型名称不能相同
     */
    public static final Integer CODE_140001 = 140001;

    /**
     * 默认渠道类型不能删除
     */
    public static final Integer CODE_140002 = 140002;

    /**
     * 渠道类型中存在客户,不能删除
     */
    public static final Integer CODE_140003 = 140003;

    /**
     * 客户等级名称不能相同
     */
    public static final Integer CODE_140004 = 140004;

    /**
     * 默认客户等级不能删除
     */
    public static final Integer CODE_140005 = 140005;

    /**
     * 客户等级中存在客户,不能删除
     */
    public static final Integer CODE_140006 = 140006;
    /**
     * 当前账号不存在
     */
    public static final Integer CODE_140007 = 140007;
    /**
     * 店内分类名称不能相同
     */
    public static final Integer CODE_140008 = 140008;
    /**
     * 分类或其子分类为默认分类,不允许删除
     */
    public static final Integer CODE_140009 = 140009;
    /**
     * 分类或其子分类下存在商品,不允许删除
     */
    public static final Integer CODE_140010 = 140010;
    /**
     * 绑定店铺分类,必须选择到最末端分类
     */
    public static final Integer CODE_140011 = 140011;
    /**
     * 当前选中项中存在默认物流公司,不允许删除!
     */
    public static final Integer CODE_140012 = 140012;
    /**
     * 当前选中项中存在默认发货地址,不允许删除!
     */
    public static final Integer CODE_140013 = 140013;
    /**
     * 货源市场不支持混批设置,请选择终端市场的商品
     */
    public static final Integer CODE_140014 = 140014;
    /**
     * 您的终端店铺已经存在该商品，请勿重复发布！
     */
    public static final Integer CODE_140015 = 140015;

    /**
     * 当前商品目录已被停用,暂不支持上架或编辑
     */
    public static final Integer CODE_140016 = 140016;

    /**
     * 商品目录已停用,商品不允许编辑
     */
    public static final Integer CODE_140017 = 140017;
    /**
     * 商品不存在或者商品已被停用
     */
    public static final Integer CODE_140018 = 140018;
    /**
     * 商品已永久停用，无法上架
     */
    public static final Integer CODE_140019 = 140019;
    /**
     * 该商品规格值XXX已被删除,暂不支持上架或编辑
     */
    public static final Integer CODE_140020 = 140020;
    /**
     * 该商品需要XX资质,请上传资质后再上架商品
     */
    public static final Integer CODE_140021 = 140021;
    /**
     * 该商品不在您的经营类目内
     */
    public static final Integer CODE_140022 = 140022;
    /**
     * 商品状态变化,请刷新页面后重试
     */
    public static final Integer CODE_140023 = 140023;
    /**
     * 该商品有新增规格项{0}
     */
    public static final Integer CODE_140024 = 140024;
    /**
     * 数据更新失败
     */
    public static final Integer CODE_20012 = 20012;

    /**
     * 供应商用户已存在
     */
    public static final Integer CODE_150001 = 150001;

    /**
     * 店铺营业执照信息已存在
     */
    public static final Integer CODE_150002 = 150002;

    /**
     * 店铺默认分类已存在
     */
    public static final Integer CODE_150003 = 150003;

    /**
     * 商品分类绑定了不存在的销售属性
     */
    public static final Integer CODE_150004 = 150004;

    /**
     * 合同起止时间不能为空
     */
    public static final Integer CODE_150005 = 150005;

    /**
     * 对象值已存在
     */
    public static final Integer CODE_160001 = 160001;

    /**
     * 该活动中的商品,在其它活动或优惠券中已被使用
     */
    public static final Integer CODE_170001 = 170001;

    /**
     * 该优惠券中的商品,在其它活动中已被使用
     */
    public static final Integer CODE_170002 = 170002;

    /**
     * 单笔支付金额小于优惠券发放条件
     */
    public static final Integer CODE_170003 = 170003;

    /**
     * 优惠券发放失败.
     */
    public static final Integer CODE_170004 = 170004;

    /**
     * 优惠券发放已达上限
     */
    public static final Integer CODE_170005 = 170005;

    /**
     * 暂无发放优惠券
     */
    public static final Integer CODE_170006 = 170006;

    /**
     * 优惠券面额不能大于使用时的商品满足的限额
     */
    public static final Integer CODE_170007 = 170007;

    /**
     * 固定期限优惠券,优惠券发放开始时间不能大于优惠券有效期的结束时间
     */
    public static final Integer CODE_170008 = 170008;
    /**
     * 不得高于终端店铺基础价格#{price}
     */
    public static final Integer CODE_170009 = 170009;

    /**
     * 不得低于货源平台基础价格#{price}
     */
    public static final Integer CODE_170010 = 170010;
    /**
     * 没有找到图片名对应的商品ID
     */
    public static final Integer CODE_170011 = 170011;
    /**
     * 当前店铺不存在此商品
     */
    public static final Integer CODE_170012 = 170012;

    /**
     * 自由定义
     */
    public static final Integer CODE_170013 = 170013;

    /**
     * 已发布过该规格商品
     */
    public static final Integer CODE_170014 = 170014;
    /**
     * 优惠券不存在
     */
    public static final Integer CODE_170015 = 170015;
    /**
     * 已选优惠券已过期
     */
    public static final Integer CODE_170016 = 170016;
    /**
     * 商品金额未达到优惠券条件
     */
    public static final Integer CODE_170017 = 170017;
    /**
     * 单笔订单总额不能超过20万
     */
    public static final Integer CODE_170018 = 170018;

    /**
     * 商品条形码已存在，商品ID为XXX
     */
    public static final Integer CODE_170019 = 170019;

    /**
     * 优惠劵发放开始日期不能大于优惠券发放结束日期
     */
    public static final Integer CODE_170020 = 170020;

    /**
     * 商品非标条形码已存在，商品ID为XXX
     */
    public static final Integer CODE_170021 = 170021;

    /**
     * 规格值验证：内容已存在{0}
     */
    public static final Integer CODE_170022 = 170022;
    /**
     * 固定期限优惠券,优惠券发放开始时间不能大于优惠券有效期的开始时间
     */
    public static final Integer CODE_170023 = 170023;
    /**
     * 请填写各个包装规格对应的运费
     */
    public static final Integer CODE_170024 = 170024;
    /**
     * 当前运费模板已有商品在使用,请先变更商品运费模板再删除该模板.
     */
    public static final Integer CODE_170025 = 170025;

    /*
     * 账户状态无效
     */
    public static final Integer CODE_180001 = 180001;
    /**
     * 冻结金额大于账户可用余额
     */
    public static final Integer CODE_180002 = 180002;

    /**
     * 该冻结流水号已解冻
     */
    public static final Integer CODE_180003 = 180003;
    /*
     * 查询类别不存在
     */
    public static final Integer CODE_180004 = 180004;

    // 19**** 关于库内交易一些错误提示
    /**
     * 订单状态发生变化,刷新页面查看最新订单状态
     */
    public static final Integer CODE_190001 = 190001;
    /**
     * 店铺id与订单id不匹配
     */
    public static final Integer CODE_190002 = 190002;
    /**
     * 部分商品库存不足,请补充库存后再发货
     */
    public static final Integer CODE_190003 = 190003;

    /**
     * 买家已取消本次交易，无法确认订单！
     */
    public static final Integer CODE_180005 = 180005;


    /**
     * 已通过审核的数据不能修改，您可以先[取消审核]再修改
     */
    public static final Integer CODE_188000 = 188000;

    /**
     * 商品已入库，不能修改
     */
    public static final Integer CODE_188001 = 188001;

    /**
     * 选中的数据中包含已入库的入库申请单，不能删除。
     */
    public static final Integer CODE_188002 = 188002;

    /**
     * 选中数据中包含已通过审核的数据不能删除，您可以先[取消审核]再删除。
     */
    public static final Integer CODE_188003 = 188003;
    /**
     * 选中数据中包含已入库的入库申请单，不能取消审核。
     */
    public static final Integer CODE_188004 = 188004;

    /**
     * 您确定将选中数据取消审核吗？
     */
    public static final Integer CODE_188005 = 188005;


    /**
     * 该店铺下没对应的 入库申请单
     */
    public static final Integer CODE_188100 = 188100;

    /**
     * 该店铺下没对应的 出库申请单
     */
    public static final Integer CODE_188101 = 188101;
    /**
     * 该店铺下没对应的 调拨单
     */
    public static final Integer CODE_188102 = 188102;


    /**
     * 商品已出库，不能修改
     */
    public static final Integer CODE_188012 = 188012;

    /**
     * 选中的数据中包含已出库的出库申请单，不能删除。
     */
    public static final Integer CODE_188007 = 188007;

    /**
     * 选中数据中包含已出库的出库申请单，不能取消审核。
     */
    public static final Integer CODE_1880010 = 188010;

    /**
     * 商品已调拨，不能修改
     */
    public static final Integer CODE_188013 = 188013;

    /**
     * 选中的数据中包含已调拨的调拨单，不能删除。
     */
    public static final Integer CODE_188014 = 188014;

    /**
     * 选中数据中包含已调拨的调拨单，不能取消审核。
     */
    public static final Integer CODE_188015 = 188015;
    /**
     * 您输入的数量已超过质押红线
     */
    public static final Integer CODE_188016 = 188016;

    /**
     * 商品存储数量已更新,请刷新页面
     */
    public static final Integer CODE_188017 = 188017;

    /**
     * 您选中的入库申请单已超过您的仓库使用限制,不能通过审核;如需继续使用请联系客服人员,客服电话:400-840-2727
     */
    public static final Integer CODE_188018 = 188018;

    /**
     * 出库单中有未出库完成的订单,请出库完成后再试.
     */
    public static final Integer CODE_188019 = 188019;

    /**
     * 调拨单中有未出库完成的订单,请出库完成后再试.
     */
    public static final Integer CODE_188020 = 188020;

    /**
     * 仓库已绑定质押商品,不能删除仓库.
     */
    public static final Integer CODE_188021 = 188021;

    // ******************************市场管理系统返回CODE定义开始
    /**
     * 摊位号已经存在
     */
    public static final Integer CODE_50400 = 50400;

    /**
     * 该摊位存在未审核通过的信息,请等待上次审核通过后再次提交申请.
     */
    public static final Integer CODE_50401 = 50401;

    /**
     * 已有关联关系请重新选择
     */
    public static final Integer CODE_50402 = 50402;
    /**
     * 不能关联自身
     */
    public static final Integer CODE_50403 = 50403;

    /**
     * 摊位状态非法，请核对后再合并
     */
    public static final Integer CODE_50404 = 50404;


    /**
     * 分割非法,洽谈区不能分割成其他类型
     */
    public static final Integer CODE_50405 = 50405;


    /**
     * 分割非法,非洽谈不能分割成洽谈区
     */
    public static final Integer CODE_50406 = 50406;

    /**
     * 摊位正在审核中，不能进行其他操作
     */
    public static final Integer CODE_50407 = 50407;

    /**
     * 绑定摊位非法，该摊位已被绑定
     */
    public static final Integer CODE_50408 = 50408;

    /**
     * 合并摊位状态非法，请核对后再操作
     */
    public static final Integer CODE_50409 = 50409;
    /**
     * 摊位类型更改错误，洽谈区不能更改为其他摊位类型
     */
    public static final Integer CODE_50410 = 50410;

    /**
     * 摊位类型更改错误，非洽谈区不能更改为洽谈区
     */
    public static final Integer CODE_50411 = 50411;
    /**
     * 摊位名称重复
     */
    public static final Integer CODE_50412 = 50412;
    /**
     * 洽谈区不能喝其他区域合并
     */
    public static final Integer CODE_50413 = 50413;
    /**
     * 该摊位正在审核不能删除
     */
    public static final Integer CODE_50414 = 50414;
    /**
     * 该摊位非空闲状态不能删除
     */
    public static final Integer CODE_50415 = 50415;




    /**
     * 基本摊位不能与非洽谈区进行操作
     */
    public static final Integer CODE_50416 = 50416;


    /**
     * 洽谈区不能与非洽谈区进行操作
     */
    public static final Integer CODE_50417 = 50417;


    /**
     * 基本摊位不能与非洽谈区关联
     */
    public static final Integer CODE_50418 = 50418;


    /**
     * 洽谈区不能与非基本摊位关联
     */
    public static final Integer CODE_50419 = 50419;
    /**
     * 信息不存在，请核对后提交
     */
    public static final Integer CODE_50420 = 50420;

    /**
     * 审核不能取消，请核对后操作
     */
    public static final Integer CODE_50421 = 50421;

    /**
     * 摊位出租中，不能合并
     */
    public static final Integer CODE_50422 = 50422;
    /**
     * 无数据
     */
    public static final Integer CODE_50000 = 50000;
    /**
     * 场馆编号已存在
     */
    public static final Integer CODE_50101=  50101;



    /**
     * 场馆存在下级节点
     */
    public static final Integer CODE_50102=  50102;

    /**
     * 生成场馆编号失败
     */
    public static final Integer CODE_50103=  50103;

    /**
     * 场馆名称已存在
     */
    public static final Integer CODE_50104=  50104;


    /**
     * 楼层编号已存在
     */
    public static final Integer CODE_50201=  50201;


    /**
     * 场馆存在下级节点
     */
    public static final Integer CODE_50202=  50202;


    /**
     * 楼层名称已存在
     */
    public static final Integer CODE_50204=  50204;




    /**
     * 区域编号已存在
     */
    public static final Integer CODE_50301=  50301;

    /**
     * 区域编号已存在
     */
    public static final Integer CODE_50302=  50302;

    /**
     * 场馆名称重复
     */
    public static final Integer CODE_50304=  50304;


    /**
     * 导入文件不能为空
     */
    public static final Integer CODE_50501= 50501;

    /**
     * 导入文件取消成功
     */
    public static final Integer CODE_50502= 50502;

    /**
     * 导入文件操作超时
     */
    public static final Integer CODE_50503= 50503;
    /**
     * 批量审核数据中包含非复审记录
     */
    public static final Integer CODE_50601= 50601;
    /**
     * 合同/审核合同id错误
     */
    public static final Integer CODE_50701= 50701;
    /**
     * 审核失败不允许确认
     */
    public static final Integer CODE_50702= 50702;
    /**
     * 终审完成
     */
    public static final Integer CODE_50703= 50703;
    /**
     * 摊位审核中
     */
    public static final Integer CODE_50704= 50704;

    /**
     * 合同审核中
     */
    public static final Integer CODE_50705= 50705;

    /**
     * 摊位已租赁
     */
    public static final Integer CODE_50706= 50706;

    /**
     * 商户不存在
     */
    public static final Integer CODE_50707= 50707;

    /**
     * 名称重复
     */
    public static final Integer CODE_50901 = 50901;


    /**
     * 名称重复
     */
    public static final Integer CODE_50902 = 50902;


    /**
     * 缴费金额大于应收金额
     */
    public static final Integer CODE_50801= 50801;

    /**
     * 授予权限不能为空
     */
    public static final Integer CODE_51001 = 51001;

    /**
     * 更新部门权限, 不能携带用户信息
     */

    /**
     * 法人身份证号重复
     */
    public static final Integer CODE_58001 = 58001;

    /**
     * 法人手机号重复
     */
    public static final Integer CODE_58002 = 58002;
    /**
     * 公司名称重复
     */
    public static final Integer CODE_58003 = 58003;

    /**
     * 统一社会信用代码重复
     */
    public static final Integer CODE_58004 = 58004;

    /**
     * 注册号重复
     */
    public static final Integer CODE_58005 = 58005;

    /**
     * 纳税人识别号重复
     */
    public static final Integer CODE_58006 = 58006;

    /**
     * 组织机构代码号重复
     */
    public static final Integer CODE_58007 = 58007;

    /**
     * 营业执照号重复
     */
    public static final Integer CODE_58008 = 58008;

    /**
     * 商铺名称重复
     */
    public static final Integer CODE_58009 = 58009;

    /**
     * 税务登记证号
     */
    public static final Integer CODE_58010 = 58010;
    public static final Integer CODE_51002 = 51002;
    // ******************************市场管理系统返回CODE定义结束

    // ******************************市场管理系统合同返回CODE定义开始
    public static final Integer CODE_70000 = 70000;

    // ******************************市场管理系统合同返回CODE定义结束

    /**
     * 审贷会 发送信息
     */
    public static final Integer CODE_60001 = 60001;
    /**
     * 缴纳服务费录入
     */
    public static final Integer CODE_60002 = 60002;
    /**
     * 申请贷款失败：网络中断
     */
    public static final Integer CODE_60003 = 60003;

    /**
     * 该用户没有店铺信息请入驻。
     */
    public static final Integer CODE_60004 = 60004;

    /**
     * 该融资项目没有相关服务信息，请质押物或缴纳保证金或添加应收账款。
     */
    public static final Integer CODE_60005 = 60005;
    /**
     * 本次用款申请已超过可用款金额请修改用款额度后，再提交用款申请。
     */
    public static final Integer CODE_60006 = 60006;
    /**
     * 用款申请所属融资项目的保理合同未签署。
     */
    public static final Integer CODE_60007 = 60007;
    /**
     * 该融资项目有审批中及等待放款的用款申请请等待处理后再提交新的申请。
     */
    public static final Integer CODE_60008 = 60008;

    /**
     * 本次缴纳的服务费超过剩余可缴额度。
     */
    public static final Integer CODE_60009 = 60009;
    /**
     * 本次缴纳的保证金超过剩余可缴额度。
     */
    public static final Integer CODE_60010 = 60010;
    /**
     * 您输入的数量已超过质押红线，需还款{0}元方可出库。
     */
    public static final Integer CODE_60011 = 60011;
    /**
     * 您有本金未按时还款，请偿还本金{0}元后申请用款
     */
    public static final Integer CODE_60012 = 60012;
    /**
     * 您的质押物低于风控红线，请补充质押物后申请用款
     */
    public static final Integer CODE_60013 = 60013;
    /**
     * 您的利息未按时支付，请支付利息{0}元后申请用款
     */
    public static final Integer CODE_60014 = 60014;

    /************* 仓库系统返回code定义开始 21开头 ****************************************/
    /**
     * 出库单ID不存在
     */
    public static final Integer CODE_210001 = 210001;
    /**
     * 该状态下不允许删除
     */
    public static final Integer CODE_210002 = 210002;

    /**
     * 该状态下不能修改
     */
    public static final Integer CODE_210003 = 210003;

    /**
     * 创建出库单失败
     */
    public static final Integer CODE_210004 = 210004;

    /**
     * 出库单修改失败
     */
    public static final Integer CODE_210005 = 210005;

    /**
     * 入库单ID不存在
     */
    public static final Integer CODE_210011 = 210011;

    /**
     * 该状态下入库单不能修改
     */
    public static final Integer CODE_210012 = 210012;

    /**
     * 该状态下入库单不能删除
     */
    public static final Integer CODE_210013 = 210013;

    /**
     * 新建商品Sku重复
     */
    public static final Integer CODE_210051 = 210051;
    /**
     * 商品库存已锁定无法调整
     */
    public static final Integer CODE_210052 = 210052;
    /**
     * 该仓储占比类型值已存在
     */
    public static final Integer CODE_220001 = 220001;
    /**
     * 仓储数据已经被消费，不能删除
     */
    public static final Integer CODE_220002 = 220002;
    /**
     * 仓储数据仅剩下一条，不能删除
     */
    public static final Integer CODE_220003 = 220003;

    /**
     * 该缴费单已收款，不能重复收款！
     */
    public static final Integer CODE_230001 = 230001;
    /**
     * 未查询到相关缴费单，请重新查询！
     */
    public static final Integer CODE_230002 = 230002;
    /**
     * 商户账号已冻结
     */
    public static final Integer CODE_230003 = 230003;
    /**
     * 商户账号可用余额不足
     */
    public static final Integer CODE_230004 = 230004;
    /**
     * 缴纳金额有误
     */
    public static final Integer CODE_230005 = 230005;

    /**
     * 需要下载的名称是{0}的文件不存在,下载失败
     */
    public static final Integer CODE_240001 = 240001;

    /**
     * 需要下载的文件不存在,下载失败
     */
    public static final Integer CODE_240002 = 240002;

    /**
     * 合同编号是{0}的文件不存在,下载失败
     */
    public static final Integer CODE_240003 = 240003;

    @Autowired
    public Messages(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getMessage(Integer code, String... params) {
        return messageSource.getMessage("C_" + code, params, Locale.getDefault());
    }
}
