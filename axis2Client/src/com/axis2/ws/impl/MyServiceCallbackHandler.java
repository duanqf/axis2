
/**
 * MyServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */

    package com.axis2.ws.impl;

    /**
     *  MyServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MyServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MyServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MyServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getUserById method
            * override this method for handling normal response from getUserById operation
            */
           public void receiveResultgetUserById(
                    com.axis2.ws.impl.GetUserByIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserById operation
           */
            public void receiveErrorgetUserById(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFirst method
            * override this method for handling normal response from getFirst operation
            */
           public void receiveResultgetFirst(
                    com.axis2.ws.impl.GetFirstResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFirst operation
           */
            public void receiveErrorgetFirst(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getInputString method
            * override this method for handling normal response from getInputString operation
            */
           public void receiveResultgetInputString(
                    com.axis2.ws.impl.GetInputStringResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getInputString operation
           */
            public void receiveErrorgetInputString(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAddResult method
            * override this method for handling normal response from getAddResult operation
            */
           public void receiveResultgetAddResult(
                    com.axis2.ws.impl.GetAddResultResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAddResult operation
           */
            public void receiveErrorgetAddResult(java.lang.Exception e) {
            }
                


    }
    