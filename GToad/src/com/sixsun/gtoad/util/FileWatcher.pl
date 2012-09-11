#!/usr/bin/perl
#ident "%W%"
# =======================================================================
# FileWatcher.pl
#	monitor the existence of given file.
#
# History:
# 	2012-09-11 02:28 initialize the first version.
#
# Usage:
#
# Version:
#	1.0 
## =======================================================================
use warnings;
use strict;
use Getopt::Long;

my $interval = 120;
my $debug    = "no";
my $minsize  = 0;
my $timeout  = 0;
my @file     = ();

GetOptions(
	"interval|i=i" => \$interval,
	"file|f=s"     => \@file,
	"timeout|t=i"  => \$timeout,
	"minsize|m=i"  => \$minsize,
	"debug:s"      => \$debug
  )
  or die "Parse options error:$!";

print $interval, "--", $debug;
