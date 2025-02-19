<@LicenseCommentBlockMacro.content />

package ${metadata.packageName}.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import ${metadata.packageName}.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ${shapeName} Marshaller
 */

public class ${shapeName}Marshaller implements Marshaller<Request<${shapeName}>, ${shapeName}> {

<#assign shape = shapes[shapeName]/>
    public Request<${shapeName}> marshall(${shape.variable.variableType} ${shape.variable.variableName}) {

        if (${shape.variable.variableName} == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

       <@RequiredParameterValidationInvocationMacro.content customConfig shape/>

       <#assign serviceNameForRequest = customConfig.customServiceNameForRequest!metadata.syncInterface />

        Request<${shapeName}> request = new DefaultRequest<${shapeName}>(${shape.variable.variableName}, "${serviceNameForRequest}");
        request.addParameter("Action", "${shape.marshaller.action}");
        <#if metadata.apiVersion?has_content>request.addParameter("Version", "${metadata.apiVersion}");</#if>
        <#if shape.marshaller.verb?has_content>request.setHttpMethod(HttpMethodName.${shape.marshaller.verb});</#if>

        <@MemberMarshallerMacro.content customConfig shapeName shape.variable.variableName shapes ""/>

        return request;
    }

    <@RequiredParameterValidationFunctionMacro.content customConfig shape/>
}
