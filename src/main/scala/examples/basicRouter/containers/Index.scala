package examples.basicRouter.containers

import react._
import redux._
import redux.Redux._
import reactRedux._
import reactRedux.ReactRedux._

import org.scalajs.dom._
import scalajs.js
import scalajs.js._
import react.ComponentClass
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.JSApp

import scala.scalajs.js.annotation.ScalaJSDefined
import react.ReactTypedConstructor
import scala.scalajs.js.annotation.JSExportAll
import reactRouter.ReactRouter._
import reactRouter._
import react.xml.XmlToCreatElement
import examples.basicRouter.components._
import examples.basicRouter.components.bootstrap.BoostrapComponents
import examples.basicRouter.components.bootstrap.Buttons
import examples.basicRouter.components.bootstrap.Menus
import examples.basicRouter.components.bootstrap.ModalSample
import examples.basicRouter.components.bootstrap.Tooltips
import examples.basicRouter.components.bootstrap.Navigation
import examples.basicRouter.components.bootstrap.PageLayout
import examples.basicRouter.components.bootstrap.Forms
import examples.basicRouter.components.bootstrap.MediaContent
import examples.basicRouter.components.bootstrap.Miscellaneous

import reduxForm._
import reduxForm.ReduxForm._

@JSExport("App3")
object Index extends JSApp {

  override def main() {
    //  try {  
    val empty: HTMLAttributes = null

    @XmlToCreatElement(true)
    val router = <Router history={ browserHistory }>
                   <Route path="/" component={ App1 }>
                    
                     <Route path="/boostrapComponents" component={ BoostrapComponents }>
                       <Route path="/boostrapComponents/buttons" component={ Buttons }/>
                       <Route path="/boostrapComponents/menus" component={ Menus }/>
                       <Route path="/boostrapComponents/modal" component={ ModalSample }/>
                       <Route path="/boostrapComponents/tooltips" component={ Tooltips }/>
                       <Route path="/boostrapComponents/navigation" component={ Navigation }/>
                       <Route path="/boostrapComponents/pageLayout" component={ PageLayout }/>
                       <Route path="/boostrapComponents/forms" component={ Forms }/>
                       <Route path="/boostrapComponents/mediaContent" component={ MediaContent }/>
                       <Route path="/boostrapComponents/miscellaneous" component={ Miscellaneous }/>
                     </Route>
                   </Route>
                 </Router>

    ReactDOM.render(router, document.getElementById("content"));

  }

} 
 
