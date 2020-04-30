#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(ParselyNativeTracker, NSObject)

RCT_EXTERN_METHOD(trackPageView:(NSString *)url)

RCT_EXTERN_METHOD(startEngagement:(NSString *)url)

RCT_EXTERN_METHOD(stopEngagement)

@end