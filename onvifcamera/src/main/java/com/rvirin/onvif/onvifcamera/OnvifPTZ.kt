package com.rvirin.onvif.onvifcamera

object OnvifPTZ {
    fun continuousMoveCommand(profileToken: String, pan: Float, tilt: Float, zoom: Float): String {
        return OnvifXMLBuilder.soapHeader +
                "<ContinuousMove xmlns=\"http://www.onvif.org/ver20/ptz/wsdl\">" +
                "<ProfileToken>$profileToken</ProfileToken>" +
                "<Velocity>" +
                "<PanTilt x=\"$pan\" y=\"$tilt\" xmlns=\"http://www.onvif.org/ver10/schema\"/>" +
                "<Zoom x=\"$zoom\" xmlns=\"http://www.onvif.org/ver10/schema\"/>" +
                "</Velocity>" +
                "</ContinuousMove>" +
                OnvifXMLBuilder.envelopeEnd
    }
}
