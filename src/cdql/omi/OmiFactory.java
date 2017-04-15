package cdql.omi;

import cdql.odf.ObjectType;
import cdql.odf.ObjectsType;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.Timestamp;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Factory class for creating O-MI types used in Scala.
 */
final public class OmiFactory {

    
    public static OmiEnvelope createReadRequestEnvelope(
            double ttl,
            ObjectsType odf,
            String version,
            String callback
    ) {     
        OmiEnvelope envelope=new OmiEnvelope();
            envelope.setTtl(ttl);
            envelope.setVersion(version);
            envelope.setRead(createReadRequest(ttl, odf,callback));
        return envelope;
    }
    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     * @param begin Timestamp defining begin of time frame to be read.
     * @param end Timestamp defining end of time frame to be read.
     * @param newest Number of newest values to be read.
     * @param oldest Number of oldest values to be read.
     * @param callback Callback address were results of this request should be
     * sent.
     * @return 
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf,
            Timestamp begin,
            Timestamp end,
            int newest,
            int oldest,
            String callback
    ) {
        CallbackBase cb = new RestCallBack(callback);
        ReadRequest rr = new ReadRequest();
        rr.setCallback(cb);
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(begin);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setBegin(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setTime(end);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setEnd(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        rr.setNewest(newest);
        rr.setOldest(oldest);
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     * @param begin Timestamp defining begin of time frame to be read.
     * @param end Timestamp defining end of time frame to be read.
     * @param newest Number of newest values to be read.
     * @param oldest Number of oldest values to be read.
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf,
            Timestamp begin,
            Timestamp end,
            int newest,
            int oldest
    ) {
        ReadRequest rr = new ReadRequest();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(begin);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setBegin(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setTime(end);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setEnd(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        rr.setNewest(newest);
        rr.setOldest(oldest);
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     * @param begin Timestamp defining begin of time frame to be read.
     * @param end Timestamp defining end of time frame to be read.
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf,
            Timestamp begin,
            Timestamp end
    ) {
        ReadRequest rr = new ReadRequest();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(begin);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setBegin(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setTime(end);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setEnd(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     * @param begin Timestamp defining begin of time frame to be read.
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf,
            Timestamp begin
    ) {
        ReadRequest rr = new ReadRequest();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(begin);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setBegin(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     * @param newest Number of newest values to be read.
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf,
            int newest
    ) {
        ReadRequest rr = new ReadRequest();
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     * @param begin Timestamp defining begin of time frame to be read.
     * @param end Timestamp defining end of time frame to be read.
     * @param callback Callback address were results of this request should be
     * sent.
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf,
            Timestamp begin,
            Timestamp end,
            String callback
    ) {
        CallbackBase cb = new RestCallBack(callback);
        ReadRequest rr = new ReadRequest();
        rr.setCallback(cb);
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(begin);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setBegin(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setTime(end);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setEnd(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     * @param begin Timestamp defining begin of time frame to be read.
     * @param callback Callback address were results of this request should be
     * sent.
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf,
            Timestamp begin,
            String callback
    ) {
        CallbackBase cb = new RestCallBack(callback);
        ReadRequest rr = new ReadRequest();
        rr.setCallback(cb);
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(begin);
        try {
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            rr.setBegin(date2);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OmiFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     * @param newest Number of newest values to be read.
     * @param callback Callback address were results of this request should be
     * sent.
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf,
            int newest,
            String callback
    ) {
        CallbackBase cb = new RestCallBack(callback);
        ReadRequest rr = new ReadRequest();
        rr.setCallback(cb);
        rr.setNewest(newest);
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     * @param callback Callback address were results of this request should be
     * sent.
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf,
            String callback
    ) {
        CallbackBase cb = new RestCallBack(callback);
        ReadRequest rr = new ReadRequest();
        rr.setCallback(cb);
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param odf O-DF structure to be read.
     */
    public static ReadRequest createReadRequest(
            double ttl,
            ObjectsType odf) {
        ReadRequest rr = new ReadRequest();
        rr.setMsg(odf);
        return rr;
    }

    /**
     *
     * @param ttl Time to live of request.
     * @param requestIDs Iterable of requestIDs to be polled.
     * @param callback Callback address were results of this request should be
     * sent.
     */
//    public static PollRequest createPollRequest(
//            Duration ttl,
//            Iterable<Long> requestIDs,
//            String callback
//    ) {
//        ICallback cb = new RawCallback(callback);
//        return new PollRequest(
//                scala.Option.apply(cb),
//                types.JavaHelpers.requestIDsFromJava(requestIDs),
//                ttl,
//                scala.Option.empty()
//        );
//    }
//
//    /**
//     *
//     * @param ttl Time to live of request.
//     * @param requestIDs Iterable of requestIDs to be polled.
//     */
//    public static PollRequest createPollRequest(
//            Duration ttl,
//            Iterable<Long> requestIDs
//    ) {
//        return new PollRequest(
//                scala.Option.empty(),
//                types.JavaHelpers.requestIDsFromJava(requestIDs),
//                ttl,
//                scala.Option.empty()
//        );
//    }
//
//    /**
//     * Creates interval subscription with callback address.
//     *
//     * @param ttl Time to live of subscription.
//     * @param interval Interval of sending of subscriped data.
//     * @param odf O-DF structure to be subscriped.
//     * @param callback Callback address were subscriped data is to be sent.
//     */
//    public static SubscriptionRequest createSubscriptionRequest(
//            Duration ttl,
//            Duration interval,
//            OdfObjects odf,
//            String callback
//    ) {
//        ICallback cb = new RawCallback(callback);
//        return new SubscriptionRequest(
//                interval,
//                odf,
//                scala.Option.empty(),
//                scala.Option.empty(),
//                scala.Option.apply(cb),
//                ttl,
//                scala.Option.empty()
//        );
//    }
//
//    /**
//     * Creates interval subscription to be polled.
//     *
//     * @param ttl Time to live of subscription.
//     * @param interval Interval of sending of subscriped data.
//     * @param odf O-DF structure to be subscriped.
//     */
//    public static SubscriptionRequest createSubscriptionRequest(
//            Duration ttl,
//            Duration interval,
//            OdfObjects odf
//    ) {
//        return new SubscriptionRequest(
//                interval,
//                odf,
//                scala.Option.empty(),
//                scala.Option.empty(),
//                scala.Option.empty(),
//                ttl,
//                scala.Option.empty()
//        );
//    }
//
//    /**
//     *
//     * @param ttl Time to live of request.
//     * @param results Iterable of O-MI result contained in O-MI response.
//     */
//    public static ResponseRequest createResponseRequest(
//            Duration ttl,
//            Iterable<OmiResult> results
//    ) {
//        return ResponseRequest$.MODULE$.apply(
//                OdfTreeCollection.fromJava(results),
//                ttl
//        );
//    }
//
//    /**
//     *
//     * @param ttl Time to live of request.
//     * @param requestIDs Iterable of requestIDs to be cancelled.
//     */
//    public static CancelRequest createCancelRequest(
//            Duration ttl,
//            Iterable<Long> requestIDs
//    ) {
//        return new CancelRequest(
//                types.JavaHelpers.requestIDsFromJava(requestIDs),
//                ttl,
//                scala.Option.empty()
//        );
//    }
//
//    /**
//     * O-MI result of subscription request.
//     *
//     * @param returnValue Return element of O-MI result element.
//     * @param requestIDs Iterable of requestIDs associated with request
//     * associated to this result.
//     * @param odf O-DF structure that was subscriped.
//     */
//    public static OmiResult createOmiResult(
//            OmiReturn returnValue,
//            Iterable<Long> requestIDs,
//            OdfObjects odf
//    ) {
//        return OmiResult$.MODULE$.apply(
//                returnValue,
//                types.JavaHelpers.requestIDsFromJava(requestIDs),
//                scala.Option.apply(odf)
//        );
//    }
//
//    /**
//     * O-MI result of subscription or cancel request.
//     *
//     * @param returnValue Return element of O-MI result element.
//     * @param requestIDs Iterable of requestIDs associated with request
//     * associated to this result.
//     */
//    public static OmiResult createOmiResult(
//            OmiReturn returnValue,
//            Iterable<Long> requestIDs
//    ) {
//        return OmiResult$.MODULE$.apply(
//                returnValue,
//                types.JavaHelpers.requestIDsFromJava(requestIDs),
//                scala.Option.empty()
//        );
//    }
//
//    /**
//     * O-MI result of subscription or cancel request.
//     *
//     * @param returnValue Return element of O-MI result element.
//     */
//    public static OmiResult createOmiResult(
//            OmiReturn returnValue
//    ) {
//        scala.collection.immutable.Vector<java.lang.Object> empty = OdfTreeCollection.empty();
//        return OmiResult$.MODULE$.apply(
//                returnValue,
//                empty,
//                scala.Option.empty()
//        );
//    }
//
//    /**
//     *
//     * @param returnCode HTTP return code associated with O-MI request.
//     * Different from HTTP return code of actual HTTP request.
//     * @param description Textual description of return value.
//     */
//    public static OmiReturn createOmiReturn(
//            String returnCode,
//            String description
//    ) {
//        return OmiReturn$.MODULE$.apply(
//                returnCode,
//                scala.Option.apply(description)
//        );
//    }
//
//    /**
//     *
//     * @param returnCode HTTP return code associated with O-MI request.
//     * Different from HTTP return code of actual HTTP request.
//     */
//    public static OmiReturn createOmiReturn(
//            String returnCode
//    ) {
//        return OmiReturn$.MODULE$.apply(
//                returnCode,
//                scala.Option.empty()
//        );
//    }
//
//    /**
//     *
//     * @param ttl Time to live of request.
//     * @param odf O-DF structure to be written to O-MI Node.
//     * @param callback Callback address were results of this request should be
//     * sent.
//     */
//    public static WriteRequest createWriteRequest(
//            Duration ttl,
//            OdfObjects odf,
//            String callback
//    ) {
//        ICallback cb = new RawCallback(callback);
//        return new WriteRequest(
//                odf,
//                scala.Option.apply(cb),
//                ttl,
//                scala.Option.empty()
//        );
//    }
//
//    /**
//     *
//     * @param ttl Time to live of request.
//     * @param odf O-DF structure to be written to O-MI Node.
//     */
//    public static WriteRequest createWriteRequest(
//            Duration ttl,
//            OdfObjects odf
//    ) {
//        return new WriteRequest(
//                odf,
//                scala.Option.empty(),
//                ttl,
//                scala.Option.empty()
//        );
//    }
}
