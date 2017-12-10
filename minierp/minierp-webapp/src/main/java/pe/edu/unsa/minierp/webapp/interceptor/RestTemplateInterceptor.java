package pe.edu.unsa.minierp.webapp.interceptor;

import java.io.IOException;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class RestTemplateInterceptor implements ClientHttpRequestInterceptor {

	protected static final Logger LOGGER = LogManager.getLogger(RestTemplateInterceptor.class);

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {

		LOGGER.info("request");
		LOGGER.info(ToStringBuilder.reflectionToString(request, ToStringStyle.JSON_STYLE));
		LOGGER.info("body");
		LOGGER.info(StringUtils.newStringUtf8(body));

		return execution.execute(request, body);
	}

}
