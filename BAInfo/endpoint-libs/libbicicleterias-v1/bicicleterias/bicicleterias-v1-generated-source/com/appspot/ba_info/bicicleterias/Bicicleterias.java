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
 * on 2013-11-01 at 01:19:31 UTC 
 * Modify at your own risk.
 */

package com.appspot.ba_info.bicicleterias;

/**
 * Service definition for Bicicleterias (v1).
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
 * This service uses {@link BicicleteriasRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Bicicleterias extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the bicicleterias library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "bicicleterias/v1/";

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
  public Bicicleterias(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Bicicleterias(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the BicicleteriaEndpoint collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Bicicleterias bicicleterias = new Bicicleterias(...);}
   *   {@code Bicicleterias.BicicleteriaEndpoint.List request = bicicleterias.bicicleteriaEndpoint().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public BicicleteriaEndpoint bicicleteriaEndpoint() {
    return new BicicleteriaEndpoint();
  }

  /**
   * The "bicicleteriaEndpoint" collection of methods.
   */
  public class BicicleteriaEndpoint {

    /**
     * Create a request for the method "bicicleteriaEndpoint.getBicicleteria".
     *
     * This request holds the parameters needed by the the bicicleterias server.  After setting any
     * optional parameters, call the {@link GetBicicleteria#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public GetBicicleteria getBicicleteria(java.lang.Long id) throws java.io.IOException {
      GetBicicleteria result = new GetBicicleteria(id);
      initialize(result);
      return result;
    }

    public class GetBicicleteria extends BicicleteriasRequest<com.appspot.ba_info.bicicleterias.model.Bicicleteria> {

      private static final String REST_PATH = "bicicleteria/{id}";

      /**
       * Create a request for the method "bicicleteriaEndpoint.getBicicleteria".
       *
       * This request holds the parameters needed by the the bicicleterias server.  After setting any
       * optional parameters, call the {@link GetBicicleteria#execute()} method to invoke the remote
       * operation. <p> {@link GetBicicleteria#initialize(com.google.api.client.googleapis.services.Abst
       * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected GetBicicleteria(java.lang.Long id) {
        super(Bicicleterias.this, "GET", REST_PATH, null, com.appspot.ba_info.bicicleterias.model.Bicicleteria.class);
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
      public GetBicicleteria setAlt(java.lang.String alt) {
        return (GetBicicleteria) super.setAlt(alt);
      }

      @Override
      public GetBicicleteria setFields(java.lang.String fields) {
        return (GetBicicleteria) super.setFields(fields);
      }

      @Override
      public GetBicicleteria setKey(java.lang.String key) {
        return (GetBicicleteria) super.setKey(key);
      }

      @Override
      public GetBicicleteria setOauthToken(java.lang.String oauthToken) {
        return (GetBicicleteria) super.setOauthToken(oauthToken);
      }

      @Override
      public GetBicicleteria setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetBicicleteria) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetBicicleteria setQuotaUser(java.lang.String quotaUser) {
        return (GetBicicleteria) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetBicicleteria setUserIp(java.lang.String userIp) {
        return (GetBicicleteria) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Long id;

      /**

       */
      public java.lang.Long getId() {
        return id;
      }

      public GetBicicleteria setId(java.lang.Long id) {
        this.id = id;
        return this;
      }

      @Override
      public GetBicicleteria set(String parameterName, Object value) {
        return (GetBicicleteria) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "bicicleteriaEndpoint.insertBicicleteria".
     *
     * This request holds the parameters needed by the the bicicleterias server.  After setting any
     * optional parameters, call the {@link InsertBicicleteria#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.appspot.ba_info.bicicleterias.model.Bicicleteria}
     * @return the request
     */
    public InsertBicicleteria insertBicicleteria(com.appspot.ba_info.bicicleterias.model.Bicicleteria content) throws java.io.IOException {
      InsertBicicleteria result = new InsertBicicleteria(content);
      initialize(result);
      return result;
    }

    public class InsertBicicleteria extends BicicleteriasRequest<com.appspot.ba_info.bicicleterias.model.Bicicleteria> {

      private static final String REST_PATH = "bicicleteria";

      /**
       * Create a request for the method "bicicleteriaEndpoint.insertBicicleteria".
       *
       * This request holds the parameters needed by the the bicicleterias server.  After setting any
       * optional parameters, call the {@link InsertBicicleteria#execute()} method to invoke the remote
       * operation. <p> {@link InsertBicicleteria#initialize(com.google.api.client.googleapis.services.A
       * bstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param content the {@link com.appspot.ba_info.bicicleterias.model.Bicicleteria}
       * @since 1.13
       */
      protected InsertBicicleteria(com.appspot.ba_info.bicicleterias.model.Bicicleteria content) {
        super(Bicicleterias.this, "POST", REST_PATH, content, com.appspot.ba_info.bicicleterias.model.Bicicleteria.class);
      }

      @Override
      public InsertBicicleteria setAlt(java.lang.String alt) {
        return (InsertBicicleteria) super.setAlt(alt);
      }

      @Override
      public InsertBicicleteria setFields(java.lang.String fields) {
        return (InsertBicicleteria) super.setFields(fields);
      }

      @Override
      public InsertBicicleteria setKey(java.lang.String key) {
        return (InsertBicicleteria) super.setKey(key);
      }

      @Override
      public InsertBicicleteria setOauthToken(java.lang.String oauthToken) {
        return (InsertBicicleteria) super.setOauthToken(oauthToken);
      }

      @Override
      public InsertBicicleteria setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (InsertBicicleteria) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public InsertBicicleteria setQuotaUser(java.lang.String quotaUser) {
        return (InsertBicicleteria) super.setQuotaUser(quotaUser);
      }

      @Override
      public InsertBicicleteria setUserIp(java.lang.String userIp) {
        return (InsertBicicleteria) super.setUserIp(userIp);
      }

      @Override
      public InsertBicicleteria set(String parameterName, Object value) {
        return (InsertBicicleteria) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "bicicleteriaEndpoint.listBicicleteria".
     *
     * This request holds the parameters needed by the the bicicleterias server.  After setting any
     * optional parameters, call the {@link ListBicicleteria#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListBicicleteria listBicicleteria() throws java.io.IOException {
      ListBicicleteria result = new ListBicicleteria();
      initialize(result);
      return result;
    }

    public class ListBicicleteria extends BicicleteriasRequest<com.appspot.ba_info.bicicleterias.model.BicicleteriaCollection> {

      private static final String REST_PATH = "bicicleteria";

      /**
       * Create a request for the method "bicicleteriaEndpoint.listBicicleteria".
       *
       * This request holds the parameters needed by the the bicicleterias server.  After setting any
       * optional parameters, call the {@link ListBicicleteria#execute()} method to invoke the remote
       * operation. <p> {@link ListBicicleteria#initialize(com.google.api.client.googleapis.services.Abs
       * tractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListBicicleteria() {
        super(Bicicleterias.this, "GET", REST_PATH, null, com.appspot.ba_info.bicicleterias.model.BicicleteriaCollection.class);
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
      public ListBicicleteria setAlt(java.lang.String alt) {
        return (ListBicicleteria) super.setAlt(alt);
      }

      @Override
      public ListBicicleteria setFields(java.lang.String fields) {
        return (ListBicicleteria) super.setFields(fields);
      }

      @Override
      public ListBicicleteria setKey(java.lang.String key) {
        return (ListBicicleteria) super.setKey(key);
      }

      @Override
      public ListBicicleteria setOauthToken(java.lang.String oauthToken) {
        return (ListBicicleteria) super.setOauthToken(oauthToken);
      }

      @Override
      public ListBicicleteria setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (ListBicicleteria) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListBicicleteria setQuotaUser(java.lang.String quotaUser) {
        return (ListBicicleteria) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListBicicleteria setUserIp(java.lang.String userIp) {
        return (ListBicicleteria) super.setUserIp(userIp);
      }

      @Override
      public ListBicicleteria set(String parameterName, Object value) {
        return (ListBicicleteria) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "bicicleteriaEndpoint.removeBicicleteria".
     *
     * This request holds the parameters needed by the the bicicleterias server.  After setting any
     * optional parameters, call the {@link RemoveBicicleteria#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public RemoveBicicleteria removeBicicleteria(java.lang.Long id) throws java.io.IOException {
      RemoveBicicleteria result = new RemoveBicicleteria(id);
      initialize(result);
      return result;
    }

    public class RemoveBicicleteria extends BicicleteriasRequest<com.appspot.ba_info.bicicleterias.model.Bicicleteria> {

      private static final String REST_PATH = "bicicleteria/{id}";

      /**
       * Create a request for the method "bicicleteriaEndpoint.removeBicicleteria".
       *
       * This request holds the parameters needed by the the bicicleterias server.  After setting any
       * optional parameters, call the {@link RemoveBicicleteria#execute()} method to invoke the remote
       * operation. <p> {@link RemoveBicicleteria#initialize(com.google.api.client.googleapis.services.A
       * bstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected RemoveBicicleteria(java.lang.Long id) {
        super(Bicicleterias.this, "DELETE", REST_PATH, null, com.appspot.ba_info.bicicleterias.model.Bicicleteria.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public RemoveBicicleteria setAlt(java.lang.String alt) {
        return (RemoveBicicleteria) super.setAlt(alt);
      }

      @Override
      public RemoveBicicleteria setFields(java.lang.String fields) {
        return (RemoveBicicleteria) super.setFields(fields);
      }

      @Override
      public RemoveBicicleteria setKey(java.lang.String key) {
        return (RemoveBicicleteria) super.setKey(key);
      }

      @Override
      public RemoveBicicleteria setOauthToken(java.lang.String oauthToken) {
        return (RemoveBicicleteria) super.setOauthToken(oauthToken);
      }

      @Override
      public RemoveBicicleteria setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (RemoveBicicleteria) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public RemoveBicicleteria setQuotaUser(java.lang.String quotaUser) {
        return (RemoveBicicleteria) super.setQuotaUser(quotaUser);
      }

      @Override
      public RemoveBicicleteria setUserIp(java.lang.String userIp) {
        return (RemoveBicicleteria) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Long id;

      /**

       */
      public java.lang.Long getId() {
        return id;
      }

      public RemoveBicicleteria setId(java.lang.Long id) {
        this.id = id;
        return this;
      }

      @Override
      public RemoveBicicleteria set(String parameterName, Object value) {
        return (RemoveBicicleteria) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "bicicleteriaEndpoint.updateBicicleteria".
     *
     * This request holds the parameters needed by the the bicicleterias server.  After setting any
     * optional parameters, call the {@link UpdateBicicleteria#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.appspot.ba_info.bicicleterias.model.Bicicleteria}
     * @return the request
     */
    public UpdateBicicleteria updateBicicleteria(com.appspot.ba_info.bicicleterias.model.Bicicleteria content) throws java.io.IOException {
      UpdateBicicleteria result = new UpdateBicicleteria(content);
      initialize(result);
      return result;
    }

    public class UpdateBicicleteria extends BicicleteriasRequest<com.appspot.ba_info.bicicleterias.model.Bicicleteria> {

      private static final String REST_PATH = "bicicleteria";

      /**
       * Create a request for the method "bicicleteriaEndpoint.updateBicicleteria".
       *
       * This request holds the parameters needed by the the bicicleterias server.  After setting any
       * optional parameters, call the {@link UpdateBicicleteria#execute()} method to invoke the remote
       * operation. <p> {@link UpdateBicicleteria#initialize(com.google.api.client.googleapis.services.A
       * bstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param content the {@link com.appspot.ba_info.bicicleterias.model.Bicicleteria}
       * @since 1.13
       */
      protected UpdateBicicleteria(com.appspot.ba_info.bicicleterias.model.Bicicleteria content) {
        super(Bicicleterias.this, "PUT", REST_PATH, content, com.appspot.ba_info.bicicleterias.model.Bicicleteria.class);
      }

      @Override
      public UpdateBicicleteria setAlt(java.lang.String alt) {
        return (UpdateBicicleteria) super.setAlt(alt);
      }

      @Override
      public UpdateBicicleteria setFields(java.lang.String fields) {
        return (UpdateBicicleteria) super.setFields(fields);
      }

      @Override
      public UpdateBicicleteria setKey(java.lang.String key) {
        return (UpdateBicicleteria) super.setKey(key);
      }

      @Override
      public UpdateBicicleteria setOauthToken(java.lang.String oauthToken) {
        return (UpdateBicicleteria) super.setOauthToken(oauthToken);
      }

      @Override
      public UpdateBicicleteria setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (UpdateBicicleteria) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public UpdateBicicleteria setQuotaUser(java.lang.String quotaUser) {
        return (UpdateBicicleteria) super.setQuotaUser(quotaUser);
      }

      @Override
      public UpdateBicicleteria setUserIp(java.lang.String userIp) {
        return (UpdateBicicleteria) super.setUserIp(userIp);
      }

      @Override
      public UpdateBicicleteria set(String parameterName, Object value) {
        return (UpdateBicicleteria) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Bicicleterias}.
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

    /** Builds a new instance of {@link Bicicleterias}. */
    @Override
    public Bicicleterias build() {
      return new Bicicleterias(this);
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
     * Set the {@link BicicleteriasRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setBicicleteriasRequestInitializer(
        BicicleteriasRequestInitializer bicicleteriasRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(bicicleteriasRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
