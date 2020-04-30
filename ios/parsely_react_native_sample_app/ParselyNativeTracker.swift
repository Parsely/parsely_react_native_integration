import Foundation
import ParselyTracker

@objc(ParselyNativeTracker)
class ParselyNativeTracker: NSObject {

  @objc func trackPageView(_ url: String) -> Void {
        self.parsely = Parsely.sharedInstance
        self.parsely.configure(siteId: "test.com")
        self.parsely.trackPageView(url: url)
  }

  @objc func startEngagement(_ url: String) -> Void {
    self.parsely = Parsely.sharedInstance
    self.parsely.configure(siteId: "test.com")
    self.parsely.startEngagement(url: url)
  }

  @objc func stopEngagement(_ url: String) -> Void {
    self.parsely = Parsely.sharedInstance
    self.parsely.configure(siteId: "test.com")
    self.parsely.stopEngagement();\
  }

}