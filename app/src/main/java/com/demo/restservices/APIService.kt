package com.demo.restservices
import com.demo.model.ResponseModels
import io.reactivex.Observable
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part


interface APIService {


    @GET("/angular/customers.php")
    fun getCustomerAll(): Observable<ResponseModels>


    @Multipart
    @POST("")
    fun saveRegisterShop(
                    @Part("categoryId")  categoryId: RequestBody,
                    @Part("shopName") shopName: RequestBody,
                    @Part("shopReg") shopReg: RequestBody,
                    @Part ownerAvatar: MultipartBody.Part,
                    @Part shopAvatar: MultipartBody.Part): Observable<ResponseModels>

    @GET("")
    fun getShowShopAll(): Observable<ResponseModels>


   /* @POST("/categrory_details.php")
    @FormUrlEncoded
    fun getCategrory(@Field("category_id") catg_name: String): Observable<ResponseModel>
*/

/*

    @Multipart
    @POST("/immigration/api/updateProfile")
    fun postImage(
                  @Part image: MultipartBody.Part,
                  @Part("firstName") firstName: String,
                  @Part("lastName") lastName: String,
                  @Part("contact") contact: String,
                  @Part("countryCode") countryCode: String
    ): Call<ResponseModel>
*/





    /*@Headers("Content-Type: application/json")
    @POST("/immigration/api/verifyOtp")
    fun verifyOtp(@Body body: Map<String, String>): Call<ResponseModel>

    @Headers("Content-Type: application/json")
    @POST("/immigration/api/resendOtp")
    fun resendOtp(@Body body: Map<String, String>): Call<ResponseModel>


    @Multipart
    @POST("/immigration/api/updateProfile")
    fun postImage(@Header ("accessToken") accessToken:String,
                  @Part image: MultipartBody.Part,
                  @Part("firstName") firstName: String,
                  @Part("lastName") lastName: String,
                  @Part("contact") contact: String,
                  @Part("countryCode") countryCode: String
                 ): Call<ResponseModel>


*/


/*

    @get:GET("/avatar_1.json")
    val avatar1: Call<JSONObject>

    @FormUrlEncoded
    @POST("/")
    fun Save(@Field("answer") name:String,
             @Field("Date") Date:String):Call<JSONObject>
*/


}