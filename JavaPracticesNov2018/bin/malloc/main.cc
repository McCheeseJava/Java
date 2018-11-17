#include <stdio.h>
#include <stdlib.h>
#include <dlfcn.h>
#include <link.h>

int 
main()
{
  void *handle;

  handle = dlopen("/home/haroonn/malloc/libfoo.so.1", RTLD_NOW|RTLD_LOCAL);
  if (handle == 0) {
      fprintf(stderr, "dlopen: %s\n", dlerror());
  }
  return 0;
}
