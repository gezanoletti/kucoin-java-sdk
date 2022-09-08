/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.websocket.event;

import com.kucoin.sdk.rest.response.TickerResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by chenshiwei on 2019/1/23.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class TickerChangeEvent extends TickerResponse
{
}
