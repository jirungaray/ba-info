/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-10-30 15:57:41 UTC)
 * on 2013-11-01 at 01:15:34 UTC 
 * Modify at your own risk.
 */

package com.appspot.ba_info.hospitales;

/**
 * Service definition for Hospitales (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link HospitalesRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Hospitales extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the hospitales library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://ba-info.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "hospitales/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Hospitales(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Hospitales(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the HospitalEndpoint collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hospitales hospitales = new Hospitales(...);}
   *   {@code Hospitales.HospitalEndpoint.List request = hospitales.hospitalEndpoint().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public HospitalEndpoint hospitalEndpoint() {
    return new HospitalEndpoint();
  }

  /**
   * The "hospitalEndpoint" collection of methods.
   */
  public class HospitalEndpoint {

    /**
     * Create a request for the method "hospitalEndpoint.getHospital".
     *
     * This request holds the parameters needed by the the hospitales server.  After setting any
     * optional parameters, call the {@link GetHospital#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public GetHospital getHospital(java.lang.Long id) throws java.io.IOException {
      GetHospital result = new GetHospital(id);
      initialize(result);
      return result;
    }

    public class GetHospital extends HospitalesRequest<com.appspot.ba_info.hospitales.model.Hospital> {

      private static final String REST_PATH = "hospital/{id}";

      /**
       * Create a request for the method "hospitalEndpoint.getHospital".
       *
       * This request holds the parameters needed by the the hospitales server.  After setting any
       * optional parameters, call the {@link GetHospital#execute()} method to invoke the remote
       * operation. <p> {@link
       * GetHospital#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected GetHospital(java.lang.Long id) {
        super(Hospitales.this, "GET", REST_PATH, null, com.appspot.ba_info.hospitales.model.Hospital.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetHospital setAlt(java.lang.String alt) {
        return (GetHospital) super.setAlt(alt);
      }

      @Override
      public GetHospital setFields(java.lang.String fields) {
        return (GetHospital) super.setFields(fields);
      }

      @Override
      public GetHospital setKey(java.lang.String key) {
        return (GetHospital) super.setKey(key);
      }

      @Override
      public GetHospital setOauthToken(java.lang.String oauthToken) {
        return (GetHospital) super.setOauthToken(oauthToken);
      }

      @Override
      public GetHospital setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetHospital) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetHospital setQuotaUser(java.lang.String quotaUser) {
        return (GetHospital) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetHospital setUserIp(java.lang.String userIp) {
        return (GetHospital) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Long id;

      /**

       */
      public java.lang.Long getId() {
        return id;
      }

      public GetHospital setId(java.lang.Long id) {
        this.id = id;
        return this;
      }

      @Override
      public GetHospital set(String parameterName, Object value) {
        return (GetHospital) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "hospitalEndpoint.insertHospital".
     *
     * This request holds the parameters needed by the the hospitales server.  After setting any
     * optional parameters, call the {@link InsertHospital#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.appspot.ba_info.hospitales.model.Hospital}
     * @return the request
     */
    public InsertHospital insertHospital(com.appspot.ba_info.hospitales.model.Hospital content) throws java.io.IOException {
      InsertHospital result = new InsertHospital(content);
      initialize(result);
      return result;
    }

    public class InsertHospital extends HospitalesRequest<com.appspot.ba_info.hospitales.model.Hospital> {

      private static final String REST_PATH = "hospital";

      /**
       * Create a request for the method "hospitalEndpoint.insertHospital".
       *
       * This request holds the parameters needed by the the hospitales server.  After setting any
       * optional parameters, call the {@link InsertHospital#execute()} method to invoke the remote
       * operation. <p> {@link InsertHospital#initialize(com.google.api.client.googleapis.services.Abstr
       * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param content the {@link com.appspot.ba_info.hospitales.model.Hospital}
       * @since 1.13
       */
      protected InsertHospital(com.appspot.ba_info.hospitales.model.Hospital content) {
        super(Hospitales.this, "POST", REST_PATH, content, com.appspot.ba_info.hospitales.model.Hospital.class);
      }

      @Override
      public InsertHospital setAlt(java.lang.String alt) {
        return (InsertHospital) super.setAlt(alt);
      }

      @Override
      public InsertHospital setFields(java.lang.String fields) {
        return (InsertHospital) super.setFields(fields);
      }

      @Override
      public InsertHospital setKey(java.lang.String key) {
        return (InsertHospital) super.setKey(key);
      }

      @Override
      public InsertHospital setOauthToken(java.lang.String oauthToken) {
        return (InsertHospital) super.setOauthToken(oauthToken);
      }

      @Override
      public InsertHospital setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (InsertHospital) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public InsertHospital setQuotaUser(java.lang.String quotaUser) {
        return (InsertHospital) super.setQuotaUser(quotaUser);
      }

      @Override
      public InsertHospital setUserIp(java.lang.String userIp) {
        return (InsertHospital) super.setUserIp(userIp);
      }

      @Override
      public InsertHospital set(String parameterName, Object value) {
        return (InsertHospital) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "hospitalEndpoint.listHospital".
     *
     * This request holds the parameters needed by the the hospitales server.  After setting any
     * optional parameters, call the {@link ListHospital#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListHospital listHospital() throws java.io.IOException {
      ListHospital result = new ListHospital();
      initialize(result);
      return result;
    }

    public class ListHospital extends HospitalesRequest<com.appspot.ba_info.hospitales.model.HospitalCollection> {

      private static final String REST_PATH = "hospital";

      /**
       * Create a request for the method "hospitalEndpoint.listHospital".
       *
       * This request holds the parameters needed by the the hospitales server.  After setting any
       * optional parameters, call the {@link ListHospital#execute()} method to invoke the remote
       * operation. <p> {@link
       * ListHospital#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListHospital() {
        super(Hospitales.this, "GET", REST_PATH, null, com.appspot.ba_info.hospitales.model.HospitalCollection.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListHospital setAlt(java.lang.String alt) {
        return (ListHospital) super.setAlt(alt);
      }

      @Override
      public ListHospital setFields(java.lang.String fields) {
        return (ListHospital) super.setFields(fields);
      }

      @Override
      public ListHospital setKey(java.lang.String key) {
        return (ListHospital) super.setKey(key);
      }

      @Override
      public ListHospital setOauthToken(java.lang.String oauthToken) {
        return (ListHospital) super.setOauthToken(oauthToken);
      }

      @Override
      public ListHospital setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (ListHospital) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListHospital setQuotaUser(java.lang.String quotaUser) {
        return (ListHospital) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListHospital setUserIp(java.lang.String userIp) {
        return (ListHospital) super.setUserIp(userIp);
      }

      @Override
      public ListHospital set(String parameterName, Object value) {
        return (ListHospital) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "hospitalEndpoint.removeHospital".
     *
     * This request holds the parameters needed by the the hospitales server.  After setting any
     * optional parameters, call the {@link RemoveHospital#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public RemoveHospital removeHospital(java.lang.Long id) throws java.io.IOException {
      RemoveHospital result = new RemoveHospital(id);
      initialize(result);
      return result;
    }

    public class RemoveHospital extends HospitalesRequest<com.appspot.ba_info.hospitales.model.Hospital> {

      private static final String REST_PATH = "hospital/{id}";

      /**
       * Create a request for the method "hospitalEndpoint.removeHospital".
       *
       * This request holds the parameters needed by the the hospitales server.  After setting any
       * optional parameters, call the {@link RemoveHospital#execute()} method to invoke the remote
       * operation. <p> {@link RemoveHospital#initialize(com.google.api.client.googleapis.services.Abstr
       * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected RemoveHospital(java.lang.Long id) {
        super(Hospitales.this, "DELETE", REST_PATH, null, com.appspot.ba_info.hospitales.model.Hospital.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public RemoveHospital setAlt(java.lang.String alt) {
        return (RemoveHospital) super.setAlt(alt);
      }

      @Override
      public RemoveHospital setFields(java.lang.String fields) {
        return (RemoveHospital) super.setFields(fields);
      }

      @Override
      public RemoveHospital setKey(java.lang.String key) {
        return (RemoveHospital) super.setKey(key);
      }

      @Override
      public RemoveHospital setOauthToken(java.lang.String oauthToken) {
        return (RemoveHospital) super.setOauthToken(oauthToken);
      }

      @Override
      public RemoveHospital setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (RemoveHospital) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public RemoveHospital setQuotaUser(java.lang.String quotaUser) {
        return (RemoveHospital) super.setQuotaUser(quotaUser);
      }

      @Override
      public RemoveHospital setUserIp(java.lang.String userIp) {
        return (RemoveHospital) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Long id;

      /**

       */
      public java.lang.Long getId() {
        return id;
      }

      public RemoveHospital setId(java.lang.Long id) {
        this.id = id;
        return this;
      }

      @Override
      public RemoveHospital set(String parameterName, Object value) {
        return (RemoveHospital) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "hospitalEndpoint.updateHospital".
     *
     * This request holds the parameters needed by the the hospitales server.  After setting any
     * optional parameters, call the {@link UpdateHospital#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.appspot.ba_info.hospitales.model.Hospital}
     * @return the request
     */
    public UpdateHospital updateHospital(com.appspot.ba_info.hospitales.model.Hospital content) throws java.io.IOException {
      UpdateHospital result = new UpdateHospital(content);
      initialize(result);
      return result;
    }

    public class UpdateHospital extends HospitalesRequest<com.appspot.ba_info.hospitales.model.Hospital> {

      private static final String REST_PATH = "hospital";

      /**
       * Create a request for the method "hospitalEndpoint.updateHospital".
       *
       * This request holds the parameters needed by the the hospitales server.  After setting any
       * optional parameters, call the {@link UpdateHospital#execute()} method to invoke the remote
       * operation. <p> {@link UpdateHospital#initialize(com.google.api.client.googleapis.services.Abstr
       * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param content the {@link com.appspot.ba_info.hospitales.model.Hospital}
       * @since 1.13
       */
      protected UpdateHospital(com.appspot.ba_info.hospitales.model.Hospital content) {
        super(Hospitales.this, "PUT", REST_PATH, content, com.appspot.ba_info.hospitales.model.Hospital.class);
      }

      @Override
      public UpdateHospital setAlt(java.lang.String alt) {
        return (UpdateHospital) super.setAlt(alt);
      }

      @Override
      public UpdateHospital setFields(java.lang.String fields) {
        return (UpdateHospital) super.setFields(fields);
      }

      @Override
      public UpdateHospital setKey(java.lang.String key) {
        return (UpdateHospital) super.setKey(key);
      }

      @Override
      public UpdateHospital setOauthToken(java.lang.String oauthToken) {
        return (UpdateHospital) super.setOauthToken(oauthToken);
      }

      @Override
      public UpdateHospital setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (UpdateHospital) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public UpdateHospital setQuotaUser(java.lang.String quotaUser) {
        return (UpdateHospital) super.setQuotaUser(quotaUser);
      }

      @Override
      public UpdateHospital setUserIp(java.lang.String userIp) {
        return (UpdateHospital) super.setUserIp(userIp);
      }

      @Override
      public UpdateHospital set(String parameterName, Object value) {
        return (UpdateHospital) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Hospitales}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Hospitales}. */
    @Override
    public Hospitales build() {
      return new Hospitales(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link HospitalesRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setHospitalesRequestInitializer(
        HospitalesRequestInitializer hospitalesRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(hospitalesRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
