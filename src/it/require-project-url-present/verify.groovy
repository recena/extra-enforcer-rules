File file = new File( basedir, "build.log" );
assert file.exists();

String text = file.getText("utf-8");
assert !text.contains('org.apache.maven.plugins.enforcer.RequireProjectUrl failed with message');

return true;
