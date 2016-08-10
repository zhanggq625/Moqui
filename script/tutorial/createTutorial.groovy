def tutorial = ec.entity.makeValue("tutorial.Tutorial")
tutorial.setFields(context, true, null, null)
tutorial.setSequencedIdPrimary()

EntityList tutorialList = ec.entity.find("tutorial.Tutorial").condition([name: name]).list()
if (tutorialList)
    ec.message.addError("用户名重复")
tutorial.create()