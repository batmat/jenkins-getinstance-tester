import jenkins.model.*

def instance = Jenkins.getInstance()
if(instance == null ) {
  def message = "[Urghhhhhhhhhhhhhhhhh] Dying because of null Jenkins instance"
  println message
  throw new IllegalStateException(message)
}
else {
  println "[YAY] Well, OK, getInstance() did not return null."
}
