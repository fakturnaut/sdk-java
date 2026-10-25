

# VerificationSummary

Short verification state of a seller.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attested** | **Boolean** | whether the tenant confirmed the seller&#39;s authorisation |  [optional] |
|**partnerCheck** | **String** | the access point partner&#39;s identity check: &lt;code&gt;unknown&lt;/code&gt;, &lt;code&gt;pending&lt;/code&gt;,      &lt;code&gt;passed&lt;/code&gt; or &lt;code&gt;failed&lt;/code&gt; |  [optional] |
|**reason** | **String** | why (stable codes such as &lt;code&gt;vies.unavailable&lt;/code&gt;, or the operator&#39;s text) |  [optional] |
|**since** | **OffsetDateTime** | when the status was set |  [optional] |
|**status** | **String** | &lt;code&gt;unverified&lt;/code&gt;, &lt;code&gt;pending_review&lt;/code&gt;, &lt;code&gt;verified&lt;/code&gt; or &lt;code&gt;rejected&lt;/code&gt; |  [optional] |



